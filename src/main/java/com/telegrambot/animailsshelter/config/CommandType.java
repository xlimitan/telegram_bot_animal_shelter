package com.telegrambot.animailsshelter.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Перечисление CommandType представляет различные команды, которые могут быть отправлены боту.
 * Каждая команда имеет свой текстовый код и описание, которое используется для идентификации и описания команды.
 */
@Getter
@RequiredArgsConstructor
public enum CommandType {
    CATS("/cats", "Приют для кошек"),
    DOGS("/dogs", "Приют для собак"),
    START("/start", "Добро пожаловать!"),
    INFO("/info", "Информация о приюте"),
    ADDRESS("shelterAddress","Адрес приюта"),
    REPORT("/report", "Прислать отчет о питомце"),
    VOLUNTEER("/volunteer", "Позвать волонтера"),
    SHELTER("/shelter", "О приюте"),
    CONTACT("/contact", "Телефон приюта"),
    PHONE("/phone", "Оставить номер телефона для связи"),
    SHELTERDIRECTIONS("/shelterDirections","Схема проезда до приюта");


    private final String command;
    private final String description;
}
