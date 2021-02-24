package com.epam.training.servlet;

public class ServiceMessage {

    private ServiceMessage() {}

    public static String BOOK_ADD = "Книга добавлена в библиотеку...";
    public static String BOOK_DELETE = "Книга успешна удалена";
    public static String EMAIL_BUSY = "Email занят...";
    public static String EMPTY_LINE = "Пустые поля, заполните все поля";
    public static String MESSAGE_ENTER = "Введите ваше сообщение...";
    public static String MESSAGE_SEND  = "Сообщение отправлено...";
    public static String REGISTRATION_EMAIL_ERROR = "Ошибка.\nEmail указан некорректно...";
    public static String REGISTRATION_EMPTY_LINE_ERROR = "Для регистрации необходимо заполнить все поля...";
    public static String REGISTRATION_SUCCESSFUL = "Регистрация прошла успешна. Войдите в систему...";
    public static String REGISTRATION_PASSWORD_ERROR = "Ошибка.\nПароль указан некорректно... Пароль должен быть из " +
            "минимум шести символов, минимум одна буква и одна цифра...";
    public static String USER_ADD_FOR_ADMIN = "Пользователь добавлен в администраторы...";
    public static String UPDATE_DATA_BOOK = "Данные книги успешно обновлены...";
    public static String USER_DELETE = "Пользователь удалён...";
    public static String UPDATE_DATA_USER = "Данные изменены";
    public static String UPDATE_DATA_USER_EMPTY_ALL_LINE = "Пустые поля... Для изменения личных данных заполните одно поля";
    public static String USER_REMOVED_FROM_ADMIN = "Пользователь убран из администраторов и добавлен в пользователи...";
    public static String VERIFICATION_ERROR = "Неправильный логин или пароль! Зарегистрируйтесь, чтобы войти в систему...";


}
