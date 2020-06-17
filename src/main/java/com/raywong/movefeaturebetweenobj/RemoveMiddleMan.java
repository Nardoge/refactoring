package com.raywong.movefeaturebetweenobj;

/**
 * @Description: 移除中间人
 * @Author Ray.Wong
 * @Date 2020/6/17 19:51
 */
public class RemoveMiddleMan {
/*
    class Person{
        Department department;
        public Person getManager(){
            return department.getManager();
        }
      }
    */

    /**
     *  Person 完全是一个中间人角色，如果每次都新增行为的时候，都需要 Person 增加新的函数。所以调整以后移除中间人
     */

    class Person {
        Department department;

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }


    class Department{
        private Person manager;

        public Department(Person manager) {
            manager = manager;
        }

        public Person getManager() {
            return manager;
        }

        public void setManager(Person manager) {
            this.manager = manager;
        }
    }

}
