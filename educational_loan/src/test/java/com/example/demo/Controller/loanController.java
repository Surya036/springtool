package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoanAppModel;
import com.example.demo.Model.LogModel;
import com.example.demo.Service.loanService;

@RestController
@RequestMapping("/login")
public class loanController {
	@Autowired
	public loanService serve;
	@PostMapping("/")
	public LoanAppModel saveinfo(@RequestBody LoanAppModel s)
	{
		return serve.save(s);
	}
	@GetMapping("/getProfile")
	public List<LoanAppModel> getInfo(int a)
	{
		return serve.getloan(a);
	}
	@GetMapping("/viewLoan/{user}")
	public List<LoanAppModel> getInfo1(@PathVariable("user")int user)
	{
		return serve.getloan(user);
	}
	@PutMapping("/put")
	public LoanAppModel updtaeinfo(@RequestBody LoanAppModel q)
	{
		return serve.update(q);
	}
	@DeleteMapping("/delete")
	public String deleteinfo(int q)
	{
		serve.delete(q);
		return "Deleted";
	}
	@Autowired
	public loanService serve1;
	@PostMapping("/user")
	public LogModel saveinfo1(@RequestBody LogModel s)
	{
		return serve1.save1(s);
	}
	@GetMapping("/getProfileuser")
	public List<LogModel> getInfo11(int a)
	{
		return serve1.getloan1(a);
	}
	@GetMapping("/viewLoanuser/{user}")
	public List<LogModel> getdetails(@PathVariable("user")int user)
	{
		return serve1.getloan1(user);
	}
	@PutMapping("/putuser")
	public LogModel updtaeinfo1(@RequestBody LogModel q)
	{
		return serve1.update1(q);
	}
	@DeleteMapping("/deleteuser")
	public String deleteinfo1(int q)
	{
		serve.delete1(q);
		return "Deleted";
	}
	
}