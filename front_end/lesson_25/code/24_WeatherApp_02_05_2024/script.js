const API_KEY = "fa1e72ff893c6a4a5ed4077327e855b4";
const locationInput = document.getElementById("locationInput");
const getWeatherButton = document.getElementById("getWeatherButton");
const weatherContainer = document.getElementById("weatherContainer");

getWeatherButton.onclick = () => {
  const cityName = locationInput.value.trim();

  fetch(`https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${API_KEY}&units=metric`)
    .then((response) => response.json())
    .then((weather) => displayWeather(weather));

  locationInput.value = "";
};

function displayWeather(weather) {
    weatherContainer.innerHTML = `
        <h2>${weather.name}</h2>
        <img src="http://openweathermap.org/img/wn/${weather.weather[0].icon}.png" />
        <p>Temperature: ${weather.main.temp}°C</p>
        <p>Description: ${weather.weather[0].description}</p>
        <p>Speed of wind: ${weather.wind.speed} m/s</p>
    `;
}