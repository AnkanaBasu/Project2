package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Student;

@Service
public class StudentService {
	private static List<Student> list = new ArrayList<Student>();

	public String insert(Student s) {
		boolean b = list.add(s);
		if (b == true) {
			return "SUCCESS";
		} else {
			return "FAIL";
		}
	}

	public String update(Student s) {
		for (Student i : list) {
			if (i.getId() == s.getId()) {
				i.setName(s.getName());
				return "SUCCESS";
			}
		}
		return "FAIL";
	}

	public String delete(int id) {
		for (Student i : list) {
			if (id == i.getId()) {
				list.remove(i);
				return "SUCCESS";
			}
		}
		return "FAIL";
	}

	public List<Student> getAll() {

		return list;
	}
}
