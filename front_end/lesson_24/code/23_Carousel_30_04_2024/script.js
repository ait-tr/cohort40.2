let urls = [];
let i = 0;
// const urlsConst = [];

const prev = document.getElementById('prev');
const image = document.getElementById('image');
const next = document.getElementById('next');

fetch('https://jsonplaceholder.typicode.com/photos')
    .then(response => response.json())
    .then(photos => {
        // Глубокая копия
        urls = [...photos.map(e => e.thumbnailUrl)];

        // Поверхностная копия
        // urls = photos.map(e => e.thumbnailUrl);

        // Изменение значения, лежащего внутри массива, сохранённого с помощью const возможно,
        // так как массив хранит в себе ссылку на место в памяти, где хранится информация
        // photos.forEach(e => urlsConst.push(e.thumbnailUrl));
    });

prev.onclick = () => {
    // if (i) {
    //     i--;
    // } else {
    //     i = urls.length - 1;
    // }
    i = i ? --i : urls.length - 1;
    image.src = urls[i];
}

next.onclick = () => {
    i = i === urls.length - 1 ? 0 : ++i;
    image.src = urls[i];
}