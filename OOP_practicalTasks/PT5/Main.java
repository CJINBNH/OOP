// Напишите программу, позволяющую анализировать посещаемость студентов.
// Используйте паттерн MVP.
// Есть группа студентов.
// Для каждого студента есть журнал его посещаемости:
// список дат занятий и для каждой даты — посетил студент занятие или нет.
// Создайте класс AttendanceService (сервис посещаемости),
// в котором хранится информация обо всех студентах.
// Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.
// Создайте класс presenter со следующими функциями:
// • Распечатать всех студентов и посещаемость каждого в процентах
// • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
// • Распечатать студентов с посещаемостью ниже 25%
// Проверьте, как это работает.

package OOP_practicalTasks.PT5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        AttendanceService attendanceService = new AttendanceService();

        attendanceService.addLogAttendance("Лисицин", LocalDate.of(2023, 1, 11), false);
        attendanceService.addLogAttendance("Лисицин", LocalDate.of(2023, 1, 12), false);
        attendanceService.addLogAttendance("Лисицин", LocalDate.of(2023, 1, 13), false);
        attendanceService.addLogAttendance("Лисицин", LocalDate.of(2023, 1, 14), false);

        attendanceService.addLogAttendance("Куницин", LocalDate.of(2023, 1, 11), true);
        attendanceService.addLogAttendance("Куницин", LocalDate.of(2023, 1, 12), false);
        attendanceService.addLogAttendance("Куницин", LocalDate.of(2023, 1, 13), false);
        attendanceService.addLogAttendance("Куницин", LocalDate.of(2023, 1, 14), true);

        attendanceService.addLogAttendance("Волков", LocalDate.of(2023, 1, 11), true);
        attendanceService.addLogAttendance("Волков", LocalDate.of(2023, 1, 12), false);
        attendanceService.addLogAttendance("Волков", LocalDate.of(2023, 1, 13), false);
        attendanceService.addLogAttendance("Волков", LocalDate.of(2023, 1, 14), true);

        attendanceService.addLogAttendance("Лисицина", LocalDate.of(2023, 1, 11), true);
        attendanceService.addLogAttendance("Лисицина", LocalDate.of(2023, 1, 12), false);
        attendanceService.addLogAttendance("Лисицина", LocalDate.of(2023, 1, 13), false);
        attendanceService.addLogAttendance("Лисицина", LocalDate.of(2023, 1, 14), false);

        attendanceService.addLogAttendance("Куницина", LocalDate.of(2023, 1, 11), true);
        attendanceService.addLogAttendance("Куницина", LocalDate.of(2023, 1, 12), true);
        attendanceService.addLogAttendance("Куницина", LocalDate.of(2023, 1, 13), true);
        attendanceService.addLogAttendance("Куницина", LocalDate.of(2023, 1, 14), false);

        attendanceService.addLogAttendance("Волкова", LocalDate.of(2023, 1, 11), false);
        attendanceService.addLogAttendance("Волкова", LocalDate.of(2023, 1, 12), false);
        attendanceService.addLogAttendance("Волкова", LocalDate.of(2023, 1, 13), false);
        attendanceService.addLogAttendance("Волкова", LocalDate.of(2023, 1, 14), true);
        
        AttendanceView attendanceView = new AttendanceView(attendanceService);

        AttendancePresenter attendancePresenter = new AttendancePresenter(attendanceService, attendanceView);

        System.out.println("Журнал посещаемости студентов:");
        attendancePresenter.printAllAttendance();

        System.out.println("Текущая посещаемость студентов:");
        attendancePresenter.printCurrentAttendance();

        System.out.println("Журнал посещаемости студентов с сортировкой:");
        attendancePresenter.printSortedAttendance();

        System.out.println("Журнал посещаемости студентов менее 25%:");
        attendancePresenter.printLowAttendance();
    }
}
