#Video Rental Store
This assignment consists of developing a program that meets the requirements below while exhibiting good object-oriented design. This homework is worth 50 points (30 points for your program and 20 points for the PDF document that describes it). 

##Problem Domain: Video Rental Store

For this homework, you will design an object-oriented program to model the following problem domain. 
(Note: see clarifications at the end of this post, for additional details on the problem domain and the program you need to implement.)

A video rental store has a catalog of 20 different videos to rent, spread across 5 different categories (New Release, Drama, Comedy, Romance, and Horror). Each video has a unique name and belongs to a specific category; the price per day to rent a video varies by category. New Release is, for example, the most expensive category. Comedy is the cheapest category.

Customers are allowed to rent a video for up to 7 nights. (Thus a video rented for 7 nights on a Monday must be returned by the following Monday. A video rented for "one day" would, for example, be rented on a Tuesday and returned the next morning before the video store opens for business on Wednesday.) Customers are allowed to have at most three videos rented at any one time.

This store has 10 customers; each customer has a unique name and is associated with one of three types. Breezy customers rent one or two videos for one or two nights. Hoarders always rent three videos for seven nights. Regular customers will rent one to three videos each time they visit for 3 to 5 nights.

Each time a customer comes into the store, a Rental is created that will keep track of what videos they rented and how many nights they will keep the videos. A customer rents the "group" of videos and returns them all at the same time. They will NOT, for example, rent three videos and then return one after 2 days, the second after 5 days, and the third after seven days. They will instead return all of the videos they rented at the specified time. (That means, for instance, that a customer will never be late in returning their videos.)

The store keeps track of the existing rentals along with the current inventory of the store. As such, when it has zero rentals, there will be 20 videos in its inventory. When it has zero videos in its inventory, it will have multiple rentals that between them account for all 20 videos.

Finally, a customer pays up front for their rental. If for example, a customer rents three Horror videos for three nights at a price of $3 per night, they will pay the store $27 dollars before they leave the store with their three videos.

##Assignment

Write an object-oriented program that implements the above problem domain and does the following:

Simulates the activity of the video store for 35 days (34 nights). On each day, a random number of customers will visit the store as long as there are videos to rent. Each customer will create one Rental that follows the rules of their associated type before they leave the store. That is, no customer will show up and then leave without making a rental. Note: if the store has less than 3 videos, then a Hoarder will NOT arrive (as they wouldn't be able to create a Rental that follows their rules). As soon as the store has zero videos, customers will magically stop arriving until videos are once again available.
At the end of the simulation, the program will produce a report that includes the following information:
the number of videos currently in the store along with a list of their names
the amount of money the store made during the 35 days (including any rentals that occurred on the 35th day)
a list of all the completed rentals including which movies were rented by which customer for how many days along with the total amount of that rental
a list of all the active rentals that includes all of the information listed in the previous bullet
Objectives

The purpose of this assignment is NOT to meet the requirements above by any means necessary. A program that does the simulation above and produces the requested report but makes use of structured programming techniques (i.e. no objects, just data structures and a main program) will receive zero points (for the whole assignment).

An object-oriented program that meets the requirements but doesn't make use of polymorphism, has poor abstractions, and poor encapsulation will lose most of the 30 points allocated to the program. Only object-oriented programs that show good use of abstraction, encapsulation, and polymorphism and meet the above requirements will be able to get full credit for the program.

Programming Languages

You are required to use Java as an object-oriented programming language.

##Logistics

Your submission will be an archive (i.e. a zip archive or compressed file) containing the source code for your program and a PDF/Doc document that describes your program and its design and that provides instructions on how to compile it and run it. The PDF document will also contain a UML class diagram that shows the classes that make up your program and the relationships that exist between them (Use some UML drawing tools, MS Visio or online available tools).

You will upload this archive (source code and PDF file) to the Canvas.

Due Dates: Refer to the Canvas assignment page. Any homework submitted after that time will be graded but will receive a 15% penalty. 

As always, you are encouraged to work in teams on this assignment. If you do, you will submit just one assignment for the entire team; that assignment will list the names of the team members at the top of the first page of the PDF document contained within the archive that you submit.

##Clarifications

A customer can have more than one active rental. That is, they can show up on day 1 and rent 1 video for 5 nights. They can then show up on day 2 and rent another video for 4 nights. As long as they do not have more than 3 videos rented, they are allowed to have multiple rentals.
Returns occur at the beginning of the day before the store opens for business. A video rented for one night is available to customers the very next day; that's because the customer rented the video for one night, watched it, and got it back to the store early the next morning.
Your program should be single-threaded; you do not need to handle the case of multiple customers trying to rent videos concurrently.
