select student.first_name, student.last_name, course.course_title, marks.mark
from student
inner join marks on student.id = marks.student_id
inner join course on marks.course_id = course.id
where course.course_title = 'programming' and marks.mark > 4
order by student.first_name, student.last_name