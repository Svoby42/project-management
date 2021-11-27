
var chartDataStr = decodeHtml(chartData);
var chartJsonArray = JSON.parse(chartDataStr);

var arrayLength = chartJsonArray.length;

var numericData = [];
var labelData = [];

for(var i=0; i < arrayLength; i++){
    numericData[i] = chartJsonArray[i].value;
    labelData[i] = chartJsonArray[i].label;
}

// For a pie chart
new Chart(document.getElementById("graf"), {
    type: 'pie',
    // The data for our dataset
    data: {
        labels: [
            'Red',
            'Blue',
            'Yellow'
        ],
        datasets: [{
            label: 'Dataset',
            data: [300, 50, 100],
            backgroundColor: [
                'rgb(255, 99, 132)',
                'rgb(54, 162, 235)',
                'rgb(255, 205, 86)'
            ],
            hoverOffset: 4
        }]
    },

    // Configuration options go here
    options: {
        title: {
            display: true,
            text: 'Project Statuses'
        }

    }
});