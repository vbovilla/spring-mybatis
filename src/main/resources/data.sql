-- Create the student table
CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(100),
    date_of_birth DATE,
    date_of_joining DATE,
    gender ENUM('Male', 'Female', 'Other')
);

-- Insert test data
INSERT INTO student (student_name, date_of_birth, date_of_joining, gender) VALUES
('John Doe', '2000-05-10', '2020-09-01', 'Male'),
('Jane Smith', '2001-08-15', '2020-09-05', 'Female'),
('Michael Johnson', '2000-12-20', '2020-08-20', 'Male'),
('Emily Brown', '2002-02-28', '2020-08-25', 'Female'),
('David Lee', '2001-06-17', '2020-09-10', 'Male'),
('Sarah Wilson', '2000-03-05', '2020-09-15', 'Female'),
('Daniel Garcia', '2001-11-30', '2020-08-15', 'Male'),
('Jessica Martinez', '2002-04-12', '2020-08-30', 'Female'),
('Matthew Taylor', '2000-07-25', '2020-09-20', 'Male'),
('Olivia Hernandez', '2001-09-08', '2020-09-25', 'Female');
