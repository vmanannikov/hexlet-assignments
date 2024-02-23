@import gg.jte.Content

@param Content welcome
@param Content users
@param Content footer = null

<head>
    <title>Работа с макетами</title>
</head>
<body>
    <header>
        ${welcome}
        <div>
            <a href="/">Добро пожаловать</a>
            <a href="/users">Пользователи</a>
        </div>
        ${users}
    </header>
    @if(footer != null)
        <footer>
            ${footer}
        </footer>
    @endif
</body>
