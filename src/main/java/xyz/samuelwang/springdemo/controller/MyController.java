package xyz.samuelwang.springdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


@RestController
public class MyController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void test(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("https://www.baidu.com");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}

	@Value("${parent.dir.path}")
	private String parentPath;

	@Value("${child.file.path}")
	private String childPath;

	@PostConstruct
	public void test() {
		try {
			/*Files.createDirectories(Paths.get(parentPath));
			Files.createFile(Paths.get(childPath));*/
			System.out.println(Paths.get(parentPath).toString());
			System.out.println(Paths.get(parentPath).toAbsolutePath().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
