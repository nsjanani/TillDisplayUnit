<h3> A Sample App for the Shop Till Display </h3>

<h4> Requirements: </h4>

<h5> Input: </h5>

<ul>
<li> Get the following input from the user  
    <ul>
        <li> Number of items to purchase</li> 
        <li> Item Name and Price for each item</li>
        <li> State Code </li>
    </ul>
</li>
</ul>

<h5> Constraints: </h5>
<table>
<tr><td><strong>Order Value</strong></td><td><strong>Discount %</strong></td></tr>
<tr><td>>= 150000</td><td>15%</td></tr>
<tr><td>>= 10000</td><td>10%</td></tr>
<tr><td>>= 7000</td><td>7%</td></tr>
<tr><td>>=5000</td><td>5%</td></tr>
<tr><td>>=1000</td><td>3%</td></tr>
</table>

<table>
<tr><td><strong>State Code</strong></td><td><strong>Tax %</strong></td></tr>
<tr><td>UT</td><td>6.85%</td></tr>
<tr><td>NV</td><td>8%</td></tr>
<tr><td>TX</td><td>6.25%</td></tr>
<tr><td>AL</td><td>4%</td></tr>
<tr><td>CA</td><td>8.25%</td></tr>
</table>

<h5> Output: </h5>
<ol>
<li> Apply discount based on total price   </li> 
<li> Apply state tax                       </li>
<li> Display the final price               </li>
</ol>

