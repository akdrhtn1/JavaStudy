package com.test.interfaceimpl2;

import java.util.ArrayList;
import java.util.List;

//	StudentManager 인터페이스를 구현해서 데이터 저장하는 클래스
public class StudentManagerImpl implements StudentManager {
	// 필드 : List / Set / Map 형태의 데이터 저장소 사용
	List<StudentVO> list;

	public StudentManagerImpl() {
		list = new ArrayList<>();

	}

	@Override
	public int insert(StudentVO stu) {

		for (StudentVO stuVO : list) {
			if (stuVO.getId().equals(stu.getId())) {
				System.out.println("중복된 값이 있습니다.");
				return 0;
			}
		}

		list.add(stu);
		return 1;
	}

	@Override
	public StudentVO selectOne(String id) {
		for (StudentVO stu : list) {
			if (stu.getId().equals(id)) {
				return stu;
			}
		}
		return null;
	}

	@Override
	public List<StudentVO> selectList(String name) {

		List<StudentVO> temp = new ArrayList<>();

		for (StudentVO stu : list) {
			if (stu.getName().equals(name)) {
				temp.add(stu);
			}

		}
		return temp;
	}

	// 전체 학생 데이터 출력
	public List<StudentVO> selectAll() {
		return list;
	}

	@Override
	public int update(StudentVO vo){
		StudentVO student = selectOne(vo.getId());
		      int index = list.indexOf(student);
		      if (student != null) {
		   
		         student.setKor(vo.getKor());
		         student.setEng(vo.getEng());
		         student.setMath(vo.getMath());
		   list.set(index,student);      

		   return 1;   
		      }
		      
		      return 0;
		}
//	@Override
//	public int update(StudentVO stu) {
//		int index = list.indexOf(stu);
//		if (!(index == -1)) {
//			StudentVO origin = list.get(index);
//			stu.setId(origin.getId());
//			stu.setName(origin.getName());
//
//			list.set(index, stu);
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int delete(String id) {
		StudentVO stu = new StudentVO();
		stu = selectOne(id);
		list.remove(stu);
		return 1;

	}

}
