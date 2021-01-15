<h1>Stooge Sort Example</h1>

<ul>
  <li>Stooge sort is a recursive sorting algorithm with a time complexity of O(n^(log 3 / log 1.5) ) = O(n^(2.7095...)). The running time of the algorithm is thus slower compared to efficient sorting algorithms, such as Merge sort, and is even slower than Bubble sort, a canonical example of a fairly inefficient and simple sort.
      <ul>
        <li>Step 1 : If value at index 0 is greater than value at last index, swap them.</li>
        <li>Step 2:  Recursively, 
           </ol>Stooge sort the initial 2/3rd of the array.</ol>
           </ol>Stooge sort the last 2/3rd of the array.</ol>
           </ol>Stooge sort the initial 2/3rd again to confirm.</ol>
        </li>     
      </ul>
  </li>
  <li>This java example shows how to sort an element of Java ArrayList using Stooge Sort method of Collections class.</li>
</ul>

<h3>The objective of Program</h3>
<ul>
  <li>The program firstly assign some values including person's atttributes to its object and performs sort process in terms of each attribute title. All sort process is implemented by Turkish alphabetical order.</li>
</ul>


<h3>Files contaning in this repository</h3>
<ul>
  <li>src
    <ul>
      <li>stoogesort
        <ul>
          <li>StoogeSortProcess.java</li>
        </ul>
      </li>
      <li>main
        <ul>
          <li>Main.java</li>
        </ul>
      </li>
      <li>model
        <ul>
          <li>Person.java</li>
        </ul>
      </li>
      <li>util
        <ul>
          <li>DefineValues.java</li>
          <li>ShowProcess.java</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h3>Explaining an inforamtion of each file</h3>

<table>
  <tr>
    <th>Files Names</th>
    <th>Information</th>
  </tr>
  <tr>
    <td>StoogeSortProcess.java</td>
    <td>Implementing Stooge Sort Process by Turkish alphabetical order</td>
  </tr>
  <tr>
    <td>Person.java</td>
    <td>Defining it as a POJO</td>
  </tr>
  <tr>
    <td>Main.java</td>
    <td>Handle with all project files to run the program</td>
  </tr>
  <tr>
    <td>ShowProcess.java</td>
    <td>Showing all information about Person Object as output </td>
  </tr>
  <tr>
    <td>DefineValues.java</td>
    <td>Filling its attributes into Person Object</td>
  </tr>
</table>
