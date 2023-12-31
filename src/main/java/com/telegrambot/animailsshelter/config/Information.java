package com.telegrambot.animailsshelter.config;

public class Information {
    /**
     * Список констант и их значения:
     * HELLO - Приветствие
     * INFO_SHELTER - Информация о приюте
     * ADDRESS_SHELTER - Адрес приюта
     * DRIVING_DIRECTIONS - Схема проезда до приюта
     * WORK_SCHEDULE - Расписание работы приюта
     * SECURITY_DATA - Контактные данные охраны для оформления пропуска
     * SAFETY_TECHNICAL - Рекомендации о технике безопасности на территории приюта для посетителей
     * LEAVE_CONTACT_DETAILS - Оставить контактные данные для обратной связи
     * CALL_VOLUNTEER - Позвать волонтера
     * RULES_OF_MEETING_A_PET - Правила знакомства с животным до того, как забрать его из приюта
     * REQUIRED_DOCUMENTS - Список документов, необходимых для того, чтобы взять животное из приюта
     * RECOMMENDATIONS_TRANSPORTATION - Список рекомендаций по транспортировке кошки или собаки
     * RECOMMENDATIONS_ADVANCEMENT_YOUNG - Список рекомендаций по обустройству дома для щенка/котенка
     * RECOMMENDATIONS_ADVANCEMENT_OLD - Список рекомендаций по обустройству дома для взрослого животного
     * RECOMMENDATIONS_ADVANCEMENT_DISABLED - Список рекомендаций по обустройству дома для животного с ограниченными возможностями (зрение, передвижение)
     * TIPS_KINOLOGIST - Советы кинолога по первичному общению с собакой (Только для приюта для собак)
     * CHOICE_KINOLOGIST - Рекомендации по проверенным кинологам для дальнейшего обращения к ним
     * REASONS_FAILURE - Список причин, почему могут отказать и не дать забрать собаку из приюта
     * SEND_REPORT - Прислать отчет о питомце
     * WARNING_BAD_REPORT - В случае, если усыновитель недолжным образом заполнял отчет, волонтер через бота может дать обратную связь в стандартной форме
     * WARNING_PHOTO_ONLY - Если пользователь прислал только фото, то бот может запросить текст
     * WARNING_PHOTO_TEXT - Если пользователь прислал только текст, то бот может запросить фото
     * CONGRATULATION - Если усыновитель прошел испытательный срок, то бот поздравляет его стандартным сообщением
     * ADDITIONAL_TIME - Если усыновителю было назначено дополнительное время испытательного срока, то бот сообщает ему и указывает количество дополнительных дней (14 или 30 дней)
     * FAILED - Если усыновитель не прошел испытательный срок, то бот уведомляет его об этом и дает инструкции по дальнейшим шагам
     */
    public static final String HELLO = "Здравствуйте! \n" +
            "Вас приветствует телеграмм бот, который поможет забрать питомца из нашего приюта В Астане.\n" +
            "Я отвечу на все вопросы и помогу Вас с выбором.";

    public static final String INFO_SHELTER = "Приют для кошек и собак в Астане \"Название приюта\"- это организация, " +
            "которая заботится о бездомных животных и предоставляет им временное убежище. В приюте животным обеспечивается питание, " +
            "медицинская помощь, уход и ветеринарная обработка. Убежище также предоставляет услуги по стерилизации и кастрации, " +
            "чтобы контролировать популяцию бездомных животных и предотвращать их нежелательное размножение. " +
            "Приюты стараются найти новых заботливых и ответственных обладателей для каждого питомца, " +
            "а также проводят кампании по просвещению и обучению о благополучии и правильном уходе за животными. " +
            "Они играют важную роль в защите и благополучии бездомных кошек и собак, давая им надежду на лучшую жизнь и любящий дом.";

    public static final String ADDRESS_SHELTER = "Мы находимся по адресу: г. Астана, Ул. Футуристическая, д. 42";

    public static final String DRIVING_DIRECTIONS = "Схема проезда до приюта:\n\n" +
            "1. Начните с центра города Астаны, где находится главная площадь Республики.\n" +
            "2. Поверните на Ул. Кенесары, которая находится рядом с площадью.\n" +
            "3. Продолжайте движение по Ул. Кенесары до перекрестка с Ул. Достык.\n" +
            "4. На перекрестке поверните направо на Ул. Достык и продолжайте движение примерно 1,5 км.\n" +
            "5. После 1,5 км вы увидите перекресток с Ул. Жибек Жолы. Поверните налево на Ул. Жибек Жолы.\n" +
            "6. Продолжайте движение по Ул. Жибек Жолы около 2 км.\n" +
            "7. После 2 км вы увидите перекресток с Ул. Футуристическая. Поверните направо на Ул. Футуристическая.\n" +
            "8. Двигайтесь по Ул. Футуристической вперед еще примерно 200 метров.\n" +
            "9. Находясь на Ул. Футуристической, вы увидите здание с номером 42, которое будет справа от вас.\n" +
            "10. Прибытие к вымышленному адресу Ул. Футуристическая, д. 42, Астана.";

    public static final String WORK_SCHEDULE = "Мы работаем с Понедельника по Воскресенье, без перерывов и выходных";

    public static final String SECURITY_DATA = "Контактные данные охраны для оформления пропуска:\n\n" +
            "- Телефон: +7(XXX)XXX-XXXX\n" +
            "- Электронная почта: security@company.com\n" +
            "- Ответственный сотрудник: Иван Петров, главный охранник\n" +
            "- Рабочие часы: с понедельника по пятницу, с 9:00 до 18:00\n" +
            "- Обращение: рекомендуется обращаться по телефону или по электронной почте для предварительного оформления пропуска, " +
            "в случае необходимости можно прийти лично в офис охраны.";

    public static final String SAFETY_TECHNICAL = "Рекомендации о технике безопасности на территории приюта для посетителей:\n\n" +
            "1. Всегда соблюдайте правила, установленные приютом. Они разработаны для вашей безопасности и безопасности животных.\n" +
            "2. Не подходите к животным без разрешения персонала приюта. Некоторые животные могут быть агрессивными или территориальными.\n" +
            "3. Не кормите животных без согласия сотрудников приюта. Они могут иметь специальную диету или страдать от пищевых аллергий.\n" +
            "4. Следите за детьми во время посещения приюта. Не допускайте, чтобы они приближались к заборам или клеткам животных без присмотра взрослых.\n" +
            "5. Внимательно следите за своими личными вещами. Не оставляйте их без присмотра, чтобы предотвратить кражу или повреждение.\n" +
            "6. Посещайте приют только в рабочее время и в официально отведенных местах. Не входите в закрытые или запретные зоны без разрешения.\n" +
            "7. Если вы замечаете опасность, немедленно сообщите об этом сотрудникам приюта.\n" +
            "8. Соблюдайте гигиену и заботьтесь о собственном здоровье, чтобы не передавать или не получить инфекцию от животных.\n" +
            "9. Если у вас есть собственные домашние животные, не приводите их в приют без согласия персонала. Это может вызвать конфликты и непредвиденные ситуации.\n" +
            "10. Уважайте правила этикета и персонал приюта. Испытывайте дружелюбие к животным, но не забывайте о собственной безопасности и ограничениях.";

    public static final String LEAVE_CONTACT_DETAILS = "Напишите свой телефон в формате 79998882211 и адрес Вашей электронной почты для обратной связи.";

    public static final String CALL_VOLUNTEER = "Волонтер получил уведомление и ответит Вам в течении 15 минут";

    public static final String RULES_OF_MEETING_A_PET = "Правила знакомства с животным до того, как забрать его из приюта:\n\n" +
            "1. Подготовьте свой дом: перед тем, как забрать животное из приюта, убедитесь, что ваш дом или квартира готовы принять его. Создайте безопасное окружение для животного, уберите опасные предметы, разместите его лежак, миску для воды и корма.\n" +
            "2. Сделайте все необходимые закупки: приобретите необходимые вещи, такие как лоток для кошки, игрушки, когтеточку, поводок и ошейник (для собаки), миски для кормления и др.\n" +
            "3. Прочитайте информацию о животном: познакомьтесь с характеристиками и нуждами выбранного вами животного. Узнайте о его возрасте, размерах, особенностях породы, особенностях здоровья и др. Подготовьтесь к этим особенностям.\n" +
            "4. Посещайте приют для знакомства: предварительно навещайте приют, где находится животное, с регулярностью. Общайтесь с ним, играйте, позвольте ему привыкнуть к вам и налаживайте взаимодействие.\n" +
            "5. Проведите время вместе: планируйте несколько дней, чтобы провести с животным, прежде чем забрать его. Проводите время вместе, чтобы лучше узнать друг друга, создать эмоциональную связь и установить взаимодействие.\n" +
            "6. Соблюдайте инструкции приюта: прислушивайтесь к советам и инструкциям сотрудников приюта. Они знают особенности каждого животного и могут дать ценные рекомендации по уходу и адаптации.\n" +
            "7. Настройтесь на долгосрочное обязательство: перед тем, как забрать животное, будьте готовы к долгосрочному уходу и заботе о нем. Это повлечет за собой регулярные визиты к ветеринару, правильное питание, эмоциональную поддержку и финансовые затраты.\n\n" +
            "Важно помнить, что знакомство с животным - это взаимный процесс, требующий терпения, понимания и любви. Будьте готовы к тому, что у каждого животного есть своя индивидуальность и он может потребовать времени, чтобы привыкнуть к новому дому и вам.";

    public static final String REQUIRED_DOCUMENTS = "Список документов, необходимых для того, чтобы взять животное из приюта:\n\n" +
            "1. Заявление о приобретении животного из приюта.\n" +
            "2. Копия паспорта или другого документа, удостоверяющего личность.\n" +
            "3. Документ, подтверждающий адрес проживания (например, копия счета за коммунальные услуги или договора аренды).\n" +
            "4. Документы, свидетельствующие о том, что вы осведомлены о правилах содержания и ухода за животным (например, брошюра, инструкция).\n" +
            "5. Подтверждение об оплате определенной суммы за содержание и уход за животным (если требуется приютом).\n" +
            "6. Опросный лист о ваших ранее имевшихся питомцах и опыте владения животными (если требуется).";

    public static final String RECOMMENDATIONS_TRANSPORTATION = "Список рекомендаций по транспортировке кошки или собаки:\n\n" +
            "1. Подготовьте специальный контейнер или клетку, который будет комфортным и безопасным для вашего питомца. Убедитесь, что контейнер достаточно прочный и имеет хорошую вентиляцию.\n" +
            "2. Позаботьтесь о необходимых документах и идентификационных метках для питомца. Проверьте, требуются ли ветеринарные сертификаты или прививки перед путешествием и убедитесь, что у вас есть все необходимые документы.\n" +
            "3. Подготовьте питомца к поездке. Если у вас есть кошка или собака, которая не привыкла ездить в автомобиле или путешествовать, помогите ей адаптироваться, предоставив короткие поездки или тренировки в транспортировке.\n" +
            "4. Поставьте контейнер с питомцем в безопасное место в вашем транспортном средстве. Если вы едете на длинное расстояние, рассмотрите возможность сделать несколько остановок, чтобы позволить своему питомцу прогуляться и использовать туалет.\n" +
            "5. Подготовьте необходимые принадлежности и питание для питомца во время путешествия. Обеспечьте быстрый доступ к воде и еде, по возможности избегайте кормления перед путешествием, чтобы уменьшить риск рвоты или дискомфорта во время поездки.\n" +
            "6. Поддерживайте комфортное окружение для питомца во время путешествия. Регулируйте температуру в салоне автомобиля, чтобы избежать перегрева или переохлаждения вашего питомца.\n" +
            "7. Будьте готовы к возможным непредвиденным ситуациям или чрезвычайным случаям. Привезите с собой необходимые медикаменты и контактную информацию ветеринара, а также заранее изучите ближайшие ветеринарные клиники по пути вашего путешествия.\n\n" +
            "Помните, что здоровье и благополучие вашего питомца - это главное. Всегда ставьте их комфорт и безопасность на первое место, когда планируете путешествие с животным.";

    public static final String RECOMMENDATIONS_ADVANCEMENT_YOUNG = "Список рекомендаций по обустройству дома для щенка/котенка:\n\n" +
            "1. Обеспечьте безопасность дома: уберите острые предметы, опасные химические вещества и мелкие предметы, которые могут быть проглочены щенком/котенком.\n" +
            "2. Создайте специальные места для отдыха, игры и сна: предоставьте щенку/котенку мягкую и удобную постельку, игрушки и вещи, которыми они будут могли заняться.\n" +
            "3. Отведите уголок для лотка или пеленки: предоставьте место для естественных нужд питомца и обучите его использовать этот уголок.\n" +
            "4. Поставьте миски для кормления на удобном месте: обеспечьте чистую и свежую воду, а также подходящую пищу для щенка/котенка.\n" +
            "5. Закройте опасные зоны: если у вас есть опасные области в доме, такие как лестницы или запретные комнаты, установите надежные преграды, чтобы предотвратить доступ щенка/котенка.\n" +
            "6. Разместите коробку для игрушек и тренировки: это поможет в организации процесса обучения и игровой активности с питомцем.\n" +
            "7. Регулярно проводите прогулки или игры на свежем воздухе: обеспечьте щенку/котенку возможность исследовать окружающую среду и получить физическую активность.\n" +
            "8. Не забывайте о здоровье: своевременно обеспечьте вакцинацию, дегельминтизацию и проводите регулярные визиты к ветеринару.\n" +
            "9. Посмотрите на дом глазами щенка/котенка: проверьте, нет ли опасных мест, куда они могут забраться или скрыться, и предпримите меры предосторожности.\n\n" +
            "Это некоторые общие рекомендации, но конкретные потребности щенка/котенка могут отличаться. Следите за поведением и приспосабливайте окружающую обстановку в соответствии с его потребностями и безопасностью.";

    public static final String RECOMMENDATIONS_ADVANCEMENT_OLD = "Список рекомендаций по обустройству дома для взрослого животного:\n\n" +
            "1. Предоставьте достаточное количество места для вашего питомца, где они могут отдыхать и спать. Возможно, вам потребуется купить специальную кошачью или собачью кровать или подушку.\n" +
            "2. Обеспечьте доступ к свежей воде в течение всего дня. Используйте достаточно большую и устойчивую миску.\n" +
            "3. Разместите лоток или подгузник для кота или собаки на удобном для них месте. Поддерживайте его чистоту и регулярно меняйте наполнитель.\n" +
            "4. Предоставьте игрушки и предметы для занятий вашего питомца. Это поможет им развиваться физически и интеллектуально, а также предотвращать скучность.\n" +
            "5. Обеспечьте безопасность вашего питомца, удалив из дома опасные предметы и химические вещества.\n" +
            "6. Создайте уютное место для питомца, где они могут спрятаться и почувствовать себя безопасно. Например, установите им специальную кошачью или собачью пещеру.\n" +
            "7. Регулярно заботьтесь о здоровье вашего питомца, включая ветеринарные осмотры, прививки и регулярную гигиену (чистка зубов, стрижка когтей и т. д.).\n" +
            "8. Поставьте надежные барьеры, чтобы предотвратить доступ питомца к опасным зонам дома, таким как кухня или стиральная машина.\n" +
            "9. Регулярно проветривайте дом, чтобы обеспечить свежий воздух и избавиться от неприятных запахов.\n" +
            "10. Уделите питомцу достаточно времени для игры, тренировок и взаимодействия с вами. Это поможет им поддерживать хорошую физическую и эмоциональную форму.";

    public static final String RECOMMENDATIONS_ADVANCEMENT_DISABLED = "Список рекомендаций по обустройству дома для животного с ограниченными возможностями (зрение, передвижение):\n\n" +
            "1. Обеспечьте безопасную и надежную раcположение для животного. Убедитесь, что оно имеет доступ к основным местам, таким как кормушка, вода, лежаки и место для туалета.\n" +
            "2. Разместите плотный ковер или специальные коврики по всему дому, чтобы предотвратить скольжение или смягчить падения для животного.\n" +
            "3. Установите поручни или ручки вдоль стен, чтобы животное могло надежно перемещаться по дому.\n" +
            "4. Расставьте яркие и контрастные предметы, чтобы помочь животному ориентироваться в пространстве и легче определить местоположение предметов.\n" +
            "5. Поставьте звуковой сигнал по краям или на опасных местах в доме, чтобы предупредить животное об опасности.\n" +
            "6. Подготовьте комнату для животного, где оно сможет отдыхать и чувствовать себя комфортно. Убедитесь, что в комнате нет острых углов или предметов, которые могут повредить животному.\n" +
            "7. Регулярно проверяйте и поддерживайте оборудование, такое как рампы или лестницы, которые помогают животному легче перемещаться по дому.\n" +
            "8. Консультируйтесь с ветеринаром или специалистом по поведению животных для получения дополнительных рекомендаций и советов по обустройству дома с учетом особых потребностей вашего животного.";

    public static final String TIPS_KINOLOGIST = "Советы кинолога по первичному общению с собакой (Только для приюта для собак):\n\n" +
            "1. Создайте спокойную и дружелюбную атмосферу во время первого знакомства с собакой.\n" +
            "2. Подойдите к собаке медленно и осторожно, избегая резких движений.\n" +
            "3. Используйте мягкий и нежный тон голоса, чтобы поговорить с собакой и успокоить ее.\n" +
            "4. Позвольте собаке подойти и понюхать вас, чтобы она могла узнать ваш запах.\n" +
            "5. Избегайте прямого взгляда и смотрите на собаку боком, чтобы не показывать агрессию.\n" +
            "6. Если собака позволяет, погладьте ее по голове или спине, чтобы установить контакт и показать, что вы дружелюбны.\n" +
            "7. Не пытайтесь трогать или шуметь вокруг собаки, если она показывает признаки стресса или нервозности.\n" +
            "8. Проявите терпение и дайте собаке время для комфортного адаптирования к вам.\n" +
            "9. Избегайте быстрого движения или резких звуков, которые могут испугать собаку.\n" +
            "10. Обязательно похвалите собаку и дайте ей вкусное лакомство в случае успеха в первичном общении, чтобы усилить положительное впечатление.";

    public static final String CHOICE_KINOLOGIST = "Рекомендации по проверенным кинологам для дальнейшего обращения к ним.\n\n" +
            "При выборе проверенного кинолога для обращения, следуйте следующим рекомендациям:\n\n" +
            "1. Просмотрите рейтинги и отзывы от других клиентов. Постарайтесь найти независимые и достоверные источники информации о работе кинолога.\n" +
            "2. Узнайте об образовании и опыте кинолога. Сертификация или участие в профессиональных организациях могут служить подтверждением его компетентности.\n" +
            "3. Обсудите свои цели и ожидания от работы с кинологом. Убедитесь, что он способен предложить подходящие решения и методы в соответствии с вашими потребностями.\n" +
            "4. Обратите внимание на подходы и методологии, используемые кинологом. Имейте в виду, что некоторые методы могут быть неэтичными или вредными для животного.\n" +
            "5. Сделайте пробное занятие или консультацию, чтобы оценить взаимодействие между вами и кинологом. Важно иметь хорошую коммуникацию и доверие.\n" +
            "6. Срочные результаты не всегда могут быть достигнуты в работе с животными. Будьте готовы к тому, что процесс требует времени и терпения.\n" +
            "7. Уточните условия работы с кинологом, такие как расценки, график занятий и доступность для связи. Убедитесь, что они соответствуют вашим потребностям и возможностям.\n" +
            "8. Не стесняйтесь задавать вопросы и выражать свои сомнения. Качественный кинолог будет готов обсудить все детали и предоставить вам всю необходимую информацию.\n\n" +
            "Следование этим рекомендациям поможет вам найти проверенного кинолога, который будет эффективно работать с вашим животным.\n" +
            "1. Иван Петрович Собаков - \n" +
            "   Телефон: +7 (999) 123-4567\n" +
            "   Электронная почта: ivan.sobakov@example.com\n\n" +
            "2. Анна Васильевна Лаика - \n" +
            "   Телефон: +7 (999) 987-6543\n" +
            "   Электронная почта: anna.laika@example.com\n\n" +
            "3. Дмитрий Анатольевич Щенячий - \n" +
            "   Телефон: +7 (999) 555-1234\n" +
            "   Электронная почта: dmitry.shchenyachiy@example.com\n\n" +
            "4. Елена Ивановна Ротвейлерова - \n" +
            "   Телефон: +7 (999) 321-6547\n" +
            "   Электронная почта: elena.rotweilerova@example.com\n\n" +
            "5. Александр Сергеевич Хаскин - \n" +
            "   Телефон: +7 (999) 876-5432\n" +
            "   Электронная почта: alexander.haskin@example.com";

    public static final String REASONS_FAILURE = "Список причин, почему могут отказать и не дать забрать собаку из приюта:\n\n" +
            "1. Неправильное окружение и условия для содержания собаки. Если у потенциального владельца нет достаточно пространства, времени и возможностей обеспечить забрать собаку должными условиями, приют может отказать в выдаче собаки.\n" +
            "2. Неспособность или неоправданное желание владеть собакой. Если потенциальный владелец не продемонстрировал знаний и навыков по уходу за собакой, либо его мотивация держать собаку вызывает опасение или сомнения, приют может отказать в выдаче животного.\n" +
            "3. Отсутствие совместимости с другими домашними животными или несовместимость с детьми. Если потенциальный владелец уже имеет других животных или детей, и приют обнаруживает, что собака несовместима с ними, это также может стать причиной отказа.\n" +
            "4. Отсутствие необходимых разрешений и условий для содержания собаки. В некоторых случаях могут быть установлены законодательные или управленческие требования для содержания собак определенных пород, или для определенного количества собак. Если потенциальный владелец не соответствует этим требованиям, приют может отказать в выдаче собаки.\n" +
            "5. Нежелание или неспособность потенциального владельца предоставить долгосрочный дом и заботу для собаки. Если приют не уверен в том, что потенциальный владелец готов взять ответственность за жизнь и здоровье собаки на длительный срок, он может отказать в выдаче собаки.";

    public static final String SEND_REPORT = "В ежедневном отчете необходимо отправить в этот чат следующею информацию: \n\n" +
            "- Фото животного.\n" +
            "- Рацион животного.\n" +
            "- Общее самочувствие и привыкание к новому месту.\n" +
            "- Изменение в поведении: отказ от старых привычек, приобретение новых.\n\n" +
            "Пример отчета:\n\n" +
            "Отчет: (обязательное слово для начала сообщения)\n\n" +
            "1. Питается хорошо.\n" +
            "2. Чувствует себя хорошо.\n" +
            "3. Ведет себя хорошо.\n";

    public static final String WARNING_BAD_REPORT = "Дорогой усыновитель, мы заметили, что Вы заполняете отчет не так подробно, как необходимо. Пожалуйста, подойдите ответственнее к этому занятию. " +
            "В противном случае волонтеры приюта будут обязаны самолично проверять условия содержания животного.";

    public static final String WARNING_PHOTO_ONLY = "Ежедневный отчет не заполнен полностью. Напишите текстом следующие пункты:\n\n" +
            "- Рацион животного.\n" +
            "- Общее самочувствие и привыкание к новому месту.\n" +
            "- Изменение в поведении: отказ от старых привычек, приобретение новых.";

    public static final String WARNING_PHOTO_TEXT = "Ежедневный отчет не заполнен полностью. Пришлите фотографию животного сделанную текущей датой.";

    public static final String CONGRATULATION = "Дорогой [имя усыновителя],\n\n" +
            "От лица всей команды и пушистых обитателей приюта для животных, хотим поздравить вас с прохождением испытательного срока! Мы благодарны за ваше теплое сердце и решительность взять на себя ответственность за нашего любимого питомца.\n" +
            "За это время вы уже показали нам, что вы настоящий образец заботливого и любящего владельца.\n" +
            "Вы оказались не только верным и заботливым другом животному, но и стали частью нашей большой семьи, в которой каждый четвероногий друг обретает свой дом.\n" +
            "Мы надеемся, что ваши дни и ночи наполнены радостью, игрой и мурлыканьем вашего нового питомца. Не сомневайтесь, что он уже забыл все свои прежние беспокойства и нашел свое счастливое место рядом с вами.\n" +
            "Если у вас возникнут вопросы или потребуется какая-либо помощь, вы можете всегда обратиться к нам, и мы будем рады поделиться советами и поддержкой.\n" +
            "Спасибо, что дали шанс нашему питомцу найти любящего и заботливого хозяина. Мы искренне надеемся, что ваша семья и ваш новый друг будут проживать незабываемые годы счастья и взаимной любви.\n" +
            "С наилучшими пожеланиями,\n" +
            "Команда приюта для животных";

    public static final String ADDITIONAL_TIME = "Вам назначено дополнительное время испытательного срока (14 или 30 дней).";

    public static final String FAILED = "Если Вы не прошел испытательный срок, то следует выполнить следующие шаги:\n\n" +
            "1. Оцените причины, по которым усыновитель не прошел испытательный срок. Это может быть связано с несоответствием ожиданиям, нежеланием или неспособностью усыновителя правильно ухаживать за животным.\n" +
            "2. Обсудите с усыновителем его опыт и проблемы, с которыми он столкнулся. Возможно, есть шанс исправить ситуацию, предоставив дополнительную помощь, советы или ресурсы.\n" +
            "3. Если вы считаете, что усыновитель не может успешно заботиться о животном, рассмотрите возможность вернуть его в приют или организацию, откуда было усыновлено животное. Обратитесь к ним за консультацией и инструкциями по возврату.\n" +
            "4. Помогите усыновителю найти другой подходящий дом для животного. Разместите информацию о животном на сайтах и в социальных сетях, обратитесь к волонтёрам и знакомым, которые могут помочь найти нового владельца.\n" +
            "5. Если ни одна из вышеперечисленных мер не приводит к решению проблемы, обратитесь к юристу или юридической консультации, чтобы оценить свои права и возможные действия по ситуации.\n\n" +
            "Важно помнить, что сам процесс усыновления животного может различаться в разных странах и регионах, поэтому всегда следуйте местным законам и инструкциям, предоставленным организацией или приютом, откуда вы усыновили животное.";
}
