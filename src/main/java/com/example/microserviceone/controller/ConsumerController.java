package com.example.microserviceone.controller;

import java.io.InputStream;

import java.util.*;

import com.example.microserviceone.entity.UserDetails;
import com.example.microserviceone.entity.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParserSettings;

@RestController
public class ConsumerController {
	

	@Autowired
	UserRepository userRepository; 

	@GetMapping("/")
	public String getDetails() {
		return "ab to chal ja yaar";
	}
	


	@PostMapping("/upload")
	public String uploadFile(@RequestParam("file") MultipartFile file) throws Exception
	{	
			List<UserDetails> userList = new ArrayList<UserDetails>();

			InputStream inputStream = file.getInputStream();

			CsvParserSettings setting = new CsvParserSettings();
			setting.setHeaderExtractionEnabled(true);
			CsvParser parser = new CsvParser(setting);
			List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
			parseAllRecords.forEach(record -> {

				UserDetails user = new UserDetails();
				user.setName(record.getString("name"));
				user.setDob(record.getString("dob"));
				user.setSalary(Integer.parseInt(record.getString("salary")));
				user.setAge(Integer.parseInt(record.getString("age")));
				userList.add(user);
			}			
			);

			userRepository.saveAll(userList);
			return "upload successfull";
	}
}
