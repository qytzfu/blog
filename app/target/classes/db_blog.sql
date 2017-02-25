DROP DATABASE IF EXISTS db_blog;
CREATE DATABASE db_blog DEFAULT CHARACTER SET utf8;
USE db_blog;

CREATE TABLE `t_author` (
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `profile` TEXT
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `t_link` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `linkname` VARCHAR(100) DEFAULT NULL,
  `linkurl` VARCHAR(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `t_blogtype` (
  `blogid` INT(10) NOT NULLt_author,
  `typename` VARCHAR(30) DEFAULT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `t_blog` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(200) NOT NULL,
  `content` TEXT,
  `releasedate` DATETIME DEFAULT NULL,
  `comment_times` INT(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `t_comment` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `userip` VARCHAR(50) DEFAULT NULL,
  `content` VARCHAR(1000) DEFAULT NULL,
  `commentdate` DATETIME DEFAULT NULL,
  `blog_id` INT(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `blog_id` (`blog_id`),
  CONSTRAINT `t_comment_blog` FOREIGN KEY (`blog_id`) REFERENCES `t_blog` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

