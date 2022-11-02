# Exploring Factors of National Coke Consumption 
In this project, I explored the data regarding the factors of national coke consumption across the globe in 19 different countries from different continents across the world in a data set that I found through the National Beverage Digest.

## Introduction
To explore the questions of what factors contribute to national coke consumption, I utilized data analysis techniques and Java to understand this data set further. I explored fundamental questions behind what causes different characteristics of the highest national coke consumption per capita in each country with programming skills and data analysis, mainly employed through the coding language Java. Finally, I came up with  questions by researching the factors influencing the amount of national beverage consumption. I was enticed the study two different factors regarding the relationship of per capita consumption of coca cola relating to geography based on one specific factor (proximity to USA aka place of origin of the beverage) and levels of overall measures of helath, specifically levels of obesity (measured in BMI).

### General Motivation
I choose this data set because I love drinking coca cola and I find that when I have traveled abroad there are different levels of consumption in different places that I go. For example, when I have traveled to places in Europe I felt as though more people were drinking coca cola, and I was curious to investigate this. I had come to this conclusion just by preliminary observation, for example in restuarants or social gatherings in other parts of the world. I have always loved soda and specifically coca cola has been my favorite out of all others, and the level of consumption I felt varied from place to place, so I was enticed to continue this discovery process.

### Questions and Theories
The first question regarding the data that I attempted to answer is if there is a relationship between the proximity of where coca cola originated (Atlanta, GA in USA) and to where it is the most popular, measured by the highest level of per capita consumption. I choose this question because my assumption was that the levels of highest per capita consumption would be in places that are closest to the origin, which is the USA. I hypothesized that there would be a negative correlation between the two variables, indicating a smaller distance or proximity would have a greater per capita consumption.

Originally, the second question that I attempted to answer is if other soft drink beverages, like sprite or fanta, have the same highest consumption rate in other countries (like if coke is highest in one country, does that mean fanta will be the highest as well).

 Although, I did not continue with answering this question because I became more interested in the relationship of coca cola with other health factors, like obesity. Instead, the second question that I attempted to answer is if there is a relationship between countries with the highest levels of obesity and the countries with the highest levels of consumption for coca cola. Since coca cola is a sugary beverage, I assumed that if it is drank more frequently in some countries, it would negatively affect measures of health. I set out to answer this question by looking at the average BMI of each of these countries, which is the most common measure of levels of obesity. Before starting to analyze my data set, I hypothesized that there would be a positive correlation, meaning that the higher the level of per capita consumption, the higher the levels of obesity.

## Methods
### Dataset Source
This data set was generated from the Beverage Digest, a privately owned company which publishes and gathers data regarding non-alcoholc beverages. This data was compiled through national survey in each of the countries. I originally found this data set on the website, University Magazine from Canada, whose goal is to provides tips on Student Life, Financial, Career, Majors, Ranking, and Important news that will impact students. To discover specifically how my data set was created, I reached out to the company. An employee from Beverage Digest explained that they use cross references and a proprietary model to collect their data. A proprietary model indicates that "means the probability and risk analysis model developed by the Company Subsidiaries in the form utilized by the Company Subsidiaries at the Effective Date, subject to material modifications as agreed by Trenwick and Option Writer" noted from Law Insider.

### Privacy and Rights to Dataset
I am able to use this dataset because on the website of the Beverage Digest under the copyright and privacy section it allows users to each download one pdf/excel document version of the data. Additionally, the data can also be found on statista, which is a free, credible, online source with hundreds of thousands of data sets. Furthermore, there is a copyright section at the bottom of where the data set came from, indicating that it can be used for research purposes if the data will not be distributed. Additionally, when I reached out to the Beverage Digest I ensured that I was legally allowed to analyze this data set.

### Process
I went about answering the questions by first gathering the data from outside sources that I would need, starting with the proximity of each of the countries to the United States of America. I did this by finding the distance in miles from the country on the original data set to the United states. I compiled a parallel data set containing the average distance in miles from each of the countries in my data set to the United States of America, the country of origin of Coca Cola. I also compiled a parallel data set for the average BMI (%) in each country for each of the countries listed on my orginal dataset.

### Question 1: Is there a relationship between levels of per capita consumption (8 oz servings) and levels of obesity (measured in BMI)?
For question 1, after compiling the data regarding the levels of per capita consumption of Coca Cola and googling each individual value of the country and its distance to USA, I set out to use statistical analysis to determine if there was a relationship between the two data sets. Next, I looked at the data and determined if there was any correlation between which had the lowest distance but highest consumption per capita of coca cola using statistiacal analysis and Java features. To do this, I created a function to output the correlation coeffcient r, which determines if there is a linear relationship between two data sets. The correlation coefficient (r) is a statistical measure of the strength of the relationship between relative movements of variables. I determined that the Y or depedent variable is the level of per capita consumption in 8 oz servings and the X or dependent variable is the proximity to the place of origin of the country. 

In order to create my function to create a correlatoin coefficient, I first created a scanner to parse through my csv file. Next, I had to compile a data strucutre, which was an arrayList, of all of the data in the column labeled "Per Capita consumption in 8 ounce servings" and added to one structure. I repeated the same process with the second column which was "Proximity to USA (miles)." Then, I found the mean of each of the arrayLists in order to use this to later find the correlation coefficient. Next, I found the numerator of the correlation coefficient, which is the sum of the difference between each indvidual x and the x values mean and the product of the product of the same for the y values. Next, I found the denominator for the r value, which is the product of the square of the root of the squares of the difference of each individual x and the mean x multiplied by the square of the difference of each individual y and the mean y.

I then looked at the output of the correlation coefficient and was able to more meaningfully draw conclusions with this new measure. Then, I was able to find the r squared value, by raising the correlation coefficient to the power of 2. Next, I analyzed and interpreted my output. 

### Question 2: Is there a relationship between the proximity of the country to the USA (coca cola' origin) and countries with the highest level of per capita consumption?
To answer my second question regarding if there was a relationship between highest per capita consumption of coca cola and levels of obesity, I researched data on the average BMI of each country in my original data set, following the same steps mentioned above. I collected data on the average BMI of indviduals per country, which is the most common measure of national obesity per country. Next, I employed Java techniques to parse through the data to find the countries with the highest BMI and see if there was any similarities between countries with the highest levels of per capita consumption. I was able to write two methods in Java to sucessfully determine the answer to my question. I decided to use the same function as answering question 1, by finding a correlation coefficient for the data set. However, the independent variable x is the level of per capita consumption for 8 oz servings and the dependent variable Y is the levels of obesity, measured in average BMI (%). One finding I came across is that because the measure of statistical analysis in calculating the correlation coefficient is symetric, meaning that it is not dependent on what is assigned the x and y variables, I learned that this was not important in my program design, only my analysis, which came later.
 
### Challenges
One challenge that I ran into was when I was compiling data from the internet outside of my original data set from the Beverage Digest, I had to ensure that it was coming from reputable sources when I was pulling the data from Google. To go about solving this issue, I made sure to only find data coming from places with .gov or national affiliation, instead of just choosing the first statistic that I found. For example, when finding the average BMI (%) of a country, it was extremely important that I was looking at the same demographic that the per capita consumption of coca cola was collected through, which is all census elligible adults. 

Another challenge that I faced was determining the overlap in data and because the sample size was relatively small, it was difficult to make meaningful conclusions. My sample size of only 19 countries does not include the whole global perspective of all countries, so I was limited in the amount of conclusion and correlation that i was able to draw. However, to solve this problem I decided to only work in the confines of my data set and determine if there were any relationships that I could draw. In order to draw meaningful conclusions from a data set using a r correlation coefficient the data must be that the data is normally distributed, contain no outliers, and obtain bivariate normality, which I assumed is true, which is a common practice in statistical analysis. 

Another challenge that I faced was determining what the appropriate types of function employment were to actually find the best ways to use Java to answer my questions. To overcome this difficulty, I used detailed psuedocode, which is the outline of the basis for my code, and thought about the steps I wanted to achieve before writing the actual code. I also tapped into my knowledge of statistics and used linear regression knowledge and finding an r value, which is the most common method of determining if there is a relationship between two different variables.

## Results and Conclusions
In my results, I found that the correlation coefficient between the level of per capita consumption and the proximity to the place of origin of coca cola, USA, is -0.8019, indicating a very strong negative association and inverse relationship between the two variables. Because this correlation coefficient is relatively close to 1, this indicates a strong relationship between the two variables, confirming my original hypothesis. Additionally, I used my r value to calculate r squared, which statistical measure in a regression model that determines the proportion of variance in the dependent variable that can be explained by the independent variable. In other words, r-squared shows how well the data fit the regression model (the goodness of fit). I found that 64.30% of the variability in Per capita consumption in 8 ounce servings can be accounted for in the change in Proximity to USA (miles). 

Next, the test that I conducted to obtain the correlation coefficient showed that the relationship between the average BMI per country and the highest levels of per capita consumption was r =0.754 to answer my second question. This means that there is a strong positive linear association between average BMI and per capita consumption by country, additionally confirming my hypothesis. For my interpretation of r squared, I found that 56.93% of the variability in Per capita consumption in 8 ounce servings can be accounted for in the change in Average BMI (%).

Additionally, using the standard deviation method that I created, which shows the spread of a data set from its mean I found that the standard deviation of the levels of average national per capita consumption in the 19 countries is 

### Further Research
If I had more time and resources that I would utilize to continue analyzing and understanding this data set is the distribution pathways and availability of coca cola in each of these countries. For example, I would look into the question regarding if the reason that there is higher consumption in some places over others is because of the larger accesibility to distribution networks and the amount that each is available in stores or other places. 

### Limitations
In order to improve my statistical design, if I had more resources and time I would eliminate the process of having to manually compile the data set regarding the proximity of the countries to the countries that I was intially analyzing and the levels of obesity. For example, I had to manually input and google each of the average BMI and distances to USA for each of the countries and put it into my file, which created more room for error. If I was able to write another program that would match the parallel data sets, this would improve my project.  This would ensure that my code would avoid human error and would run more efficiently and smoothly, minimizing the risk of making a mistake.

Additionally, I would run other statistical tests such as a confidence interval to determine the true mean given the data set of the national average consumption per capita of coca cola. I could also conduct a t-test, or hypothesis of means to determine with what alpha or beta level I can be certain that the true mean falls in the interval.

## Graphs
## Bar Graph 
In order to visualize the data that I was working with, I constructed a simple bar chart to display the quantitative data of the comparison of each country with their average coca cola conusmption levels per capita for the 19 countries.
<img src="BarGraph.jpg" width="600" height="400">

## World Graph
Additionally, I used another feature to visualize my data that displays the distributio and relative quantities of per capita consumption of coca cola across the world by country. The darker and more saturated countries represent higher per capita consumption and the lighter less saturated countries represent the lower amounts of per capita consumption.
<img src="WorldGraph.png" width="600" height="400">

### Scatter Plot to visualize linear relationships
Once I was able to obtain my correlation coefficients and utilize linear regression, I wanted to visualize the scatterplot and linear fit of the data, thus creating two scatterplots with the two variables, demonstrated below.
<img src="ProxPerCapGraph.png" width="600" height="400">
<img src="BMIPerCap.png" width="600" height="400">
