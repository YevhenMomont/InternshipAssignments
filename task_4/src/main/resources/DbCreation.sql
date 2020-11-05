CREATE TABLE teacher (
	id SERIAL NOT NULL  CONSTRAINT pk_teacher PRIMARY KEY,
	first_name text NOT NULL,
	last_name text NOT NULL,
	email text NOT NULL);

CREATE TABLE course (
	id SERIAL NOT NULL CONSTRAINT pk_course PRIMARY KEY,
	course_title text NOT NULL,
	teacher_id bigint CONSTRAINT fk_course_teacher REFERENCES teacher);

CREATE TABLE "group" (
	id SERIAL NOT NULL  CONSTRAINT pk_group PRIMARY KEY,
	name text NOT NULL);

CREATE TABLE student (
	id SERIAL NOT NULL  CONSTRAINT pk_student PRIMARY KEY,
	first_name text NOT NULL,
	last_name text NOT NULL,
	group_id bigint CONSTRAINT fk_student_group REFERENCES "group");

CREATE TABLE marks (
	course_id bigint CONSTRAINT fk_marks_course REFERENCES course,
	student_id bigint CONSTRAINT fk_marks_student REFERENCES student,
	mark int NOT NULL,
	PRIMARY KEY(course_id, student_id));