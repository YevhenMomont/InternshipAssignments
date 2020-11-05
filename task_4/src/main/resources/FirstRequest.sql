SELECT teacher.first_name, teacher.last_name from teacher
join course on teacher.id = course.id
join marks on course.id = marks.course_id
group by course_id
having count(student_id) > 2000