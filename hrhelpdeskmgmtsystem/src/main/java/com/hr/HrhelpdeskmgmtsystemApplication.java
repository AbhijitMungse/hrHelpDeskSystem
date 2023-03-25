package com.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hr.entity.Interview;
import com.hr.repository.InterviewRepository;

@SpringBootApplication
public class HrhelpdeskmgmtsystemApplication implements CommandLineRunner{
	
	@Autowired
	private InterviewRepository interviewRepository;

	public static void main(String[] args) {
		SpringApplication.run(HrhelpdeskmgmtsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Interview i1 = Interview.builder().name("abhijit").mobNo("9096316425").email("abhijit@gmail.com").college("AVCOE").qualification("BE").date("01-02-2023").build();
		Interview i2 = Interview.builder().name("Sagar").mobNo("8872634179").email("sagar@gmail.com").college("SBNES").qualification("BCA").date("01-03-2023").build();
		Interview i3 = Interview.builder().name("Harshal").mobNo("8547223598").email("harsh@gmail.com").college("VPNH").qualification("MCA").date("01-03-2023").build();
		Interview i4 = Interview.builder().name("Shubham").mobNo("9523794277").email("shubham@gmail.com").college("SHRAMIK").qualification("MCS").date("01-03-2023").build();
		
		interviewRepository.save(i1);
		interviewRepository.save(i2);
		interviewRepository.save(i3);
		interviewRepository.save(i4);
		
		
		System.out.println("-----------All SAved-----------------");
	}

}
