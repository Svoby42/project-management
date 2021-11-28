var grafDataStr = decodeHtml(grafData);
var grafJsonArray = JSON.parse(grafDataStr);

var arrayLength = grafJsonArray.length;

var numericData = [];
var labelData = [];

for(var i = 0; i < arrayLength; i++){
    numericData[i] = grafJsonArray[i].pocet;
    labelData[i] = grafJsonArray[i].stav;
}


new Chart(document.getElementById("graf"), {
    type: 'pie',
    // The data for our dataset
    data: {
        labels: labelData,
        datasets: [{
            label: 'Dataset',
            data: [300, 50, 100],
            backgroundColor: [
                'rgb(255, 99, 132)',
                'rgb(54, 162, 235)',
                'rgb(255, 205, 86)'
            ],
            data: numericData
        }]
    },
    options: {
        title: {
            display: true,
            text: "Stavy projektů"
        }
    }
});

// [{"value":1, "label": "Nezahájen"}, {"value":2,"label": "Ve vývoji"}, {"value":3, "label": "Hotovo"}]
function decodeHtml(html){
    var txt = document.createElement("textarea");
    txt.innerHTML = html;
    return txt.value;
}