select count(s.id)
from student as s
inner join marks on s.id = marks.student_id
where marks.mark = 5;
select count(s.id), teacher.first_name, "group".name
from student as s
inner join marks on s.id = marks.student_id
inner join course on marks.course_id = course.id
inner join teacher on course.teacher_id = teacher.id
inner join "group" on s.group_id = "group".id
group by  teacher.first_name, "group".name;
-- second solution
select count(s.id), teacher.first_name,
case when marks.mark = 5 then count(s.id)
end as excellent_students
from student as s
inner join marks on s.id = marks.student_id
inner join course on marks.course_id = course.id
inner join teacher on course.teacher_id = teacher.id
inner join "group" on s.group_id = "group".id
group by  teacher.first_name, marks.mark;