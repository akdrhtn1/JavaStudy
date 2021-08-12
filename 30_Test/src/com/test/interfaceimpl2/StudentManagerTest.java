package com.test.interfaceimpl2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		// 5명 학생 정보 만들고 구현메소드 확인(이름중복 2명이상)

		new StudentJoin().showMenu();
	}

	static class StudentJoin {
		StudentManager student;
		Scanner scan;
		int userChoice;

		StudentJoin() {
			scan = new Scanner(System.in);
			student = new StudentManagerImpl();

			student.insert(new StudentVO("201344010", "이순신", 10, 20, 30));
			student.insert(new StudentVO("20441032", "김시민", 40, 80, 30));
			student.insert(new StudentVO("2044120", "신립", 50, 70, 30));
			student.insert(new StudentVO("20115631", "김시민", 60, 50, 30));
			student.insert(new StudentVO("20115203", "사명대사", 30, 60, 30));
		}

		private void showMenu() {

			while (true) {
				System.out.println("0.종료 1.추가 2.조회 3.점수 변경 4.삭제");
				userChoice = Integer.parseInt(scan.nextLine());

				switch (userChoice) {
				case 0:
					System.out.println("프로그램을 종료하겠습니다.!");
					break;
				case 1:
					insert();
					break;
				case 2:
					search();
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				default:
					System.out.println("잘못된 값을 입력하셨습니다");
					System.out.println("다시 입력해주세요");
				}
				if (userChoice == 0) {
					break;
				}

			}
		}

		private void insert() {
			StudentVO stu = new StudentVO();
			int isCheck = 0;

			System.out.print("학번 입력>>");
			stu.setId(scan.nextLine());
			System.out.print("이름 입력>>");
			stu.setName(scan.nextLine());
			System.out.print("국어점수 입력>>");
			stu.setKor(Integer.parseInt(scan.nextLine()));
			System.out.print("영어점수 입력>>");
			stu.setEng(Integer.parseInt(scan.nextLine()));
			System.out.print("수학점수 입력>>");
			stu.setMath(Integer.parseInt(scan.nextLine()));

			isCheck = student.insert(stu);
			if (isCheck == 1) {
				System.out.println("정삭적으로 id가 등록되었습니다.");
			} else {
				insert();
			}
		}

		private void search() {
			StudentVO stuVO = new StudentVO();
			List<StudentVO> list = new ArrayList<>();

			while (true) {
				System.out.println("1.학번 조회 2.이름 조회 3. 전체 학생 조회 4. 뒤로가기");
				userChoice = Integer.parseInt(scan.nextLine());
				// 학번 중복검증후 조회
				if (userChoice == 1) {
					String id = validate();
					if (!id.equalsIgnoreCase("exit")) {
						stuVO = student.selectOne(id);
						printInfo(stuVO);
					}
					// 동일 이름 여러명 출력 가능한 리스트 조회
				} else if (userChoice == 2) {
					System.out.print("조회하실 이름을 입력해주세요 : ");
					String name = scan.nextLine();
					list = student.selectList(name);
					if (!list.isEmpty()) {

						for (StudentVO stu : list) {
							printInfo(stu);
						}
					} else {
						System.out.println("해당 학생의 이름은 존재하지 않습니다.");
					}
					// 모든 학생 조회(list)출력
				} else if (userChoice == 3) {
					list = student.selectAll();
					for (StudentVO stu : list) {
						printInfo(stu);
					}

				} else if (userChoice == 4) {
					break;
				}
			}
		}

		private void update() {

			String id = validate();
			if (!id.equalsIgnoreCase("exit")) {

				StudentVO stu = new StudentVO();
				stu = student.selectOne(id);

				System.out.println("변경하실 국어 점수를 입력해주세요 : ");
				int score = Integer.parseInt(scan.nextLine());
				stu.setKor(score);

				System.out.println("변경하실 영어 점수를 입력해주세요 : ");
				score = Integer.parseInt(scan.nextLine());
				stu.setEng(score);

				System.out.println("변경하실 수학 점수를 입력해주세요 : ");
				score = Integer.parseInt(scan.nextLine());
				stu.setMath(score);

				int check = student.update(stu);
				// 정상적으로 입력되면 출력
				if (check == 1) {
					System.out.println("점수가 정상적으로 변경 되었습니다.");
				} else {
					System.out.println("변경 오류입니다.");
				}
			}

		}

		// 학번의 유무 검증 학번이 있으면 id반환 없으면 다시 입력
		private String validate() {
			StudentVO stuVO = new StudentVO();

			System.out.println("학번을 입력해주세요 : ");
			String id = scan.nextLine();
			stuVO = student.selectOne(id);

			while (stuVO == null) {
				System.out.println("없는 학번입니다.");
				System.out.print("학번을 다시 입력해주세요(종료:exit) : ");
				id = scan.nextLine();
				stuVO = student.selectOne(id);

				if (id.equalsIgnoreCase("exit")) {
					return "exit";
				}
			}
			return id;
		}

		private void delete() {
			String id = validate();
			if (!id.equalsIgnoreCase("exit")) {
				System.out.println("정말로 삭제 하시겠습니까? y/n");
				String yesNo = scan.nextLine();
				if (yesNo.equalsIgnoreCase("y")) {
					int check = student.delete(id);
					if (check == 1) {
						System.out.println("데이터가 정상적으로 삭제 됐습니다");
					} else {
						System.out.println("삭제가 안됐습니다");
					}
				}
			}

		}

		// 조회된 내용 출력
		private void printInfo(StudentVO stu) {
			System.out.println("===============점수확인===============");
			System.out.printf("학번: %s 이름: %s\n" + "국어점수:%3d 영어점수:%3d 수학점수:%3d\n" + "총점:%3d 평균:%.2f\n", stu.getId(),
					stu.getName(), stu.getKor(), stu.getEng(), stu.getMath(), stu.getTot(), stu.getAvg());
			System.out.println("===================================");
		}

	}
}
