## John Allspaw on complexity and crisis management

1. “In crisis management, be quick with the facts, slow with the blame.” — Leonard Saffir

If you have been in a production down bridge call, you will experience one of the most stressful things that occur in the tech field.

These issues can happen at any time of the day or night. If you don't have a follow the sun team (people that can cover production just during their daylight working hours), then the outage can occur during the middle of the night, on your commute home, when you are out to dinner with your family, etc. This is common for smaller organizations like start ups. 

You will usually have an alerting mechanism (via text message, email, automated call, etc) that will trigger of production monitors. This can be as simple as a monitor for a site page not being available, to certain expected transactions dipping below a threshold. 

When you get the alert, you will need to make it to a machine that can connect to your production environment as soon as you can. Response to issues will usually be tracked by service level agreements (SLAs) that are essntially a contracted time in which you must respond to the alert. Sometimes there are actually monetary effects of not meeting SLAs, in some cases customers will get a refund for time lost to a response time gap.

The stress of a production down bridge can be palpable if you have ever been part of one. There is often an ask for continuous updates to pass on to leadership and customers. There may be people on the call who have been awakened in the middle of the night and are sleep deprived. Some of the people may have been on several other production down calls in the same day. Some people may have some personal issues that are now affecting their mood during the call. Some people may be brand new to the company and this may be their first site down call on a new job.

There will often be confusion, or at the very least, there will be a very dynamic hand offs of who is working on certain things during the call. There may be several engineers working on the same item, either different parts of the infrastructure or handing off the same item sequentially. Those engineers may be asked for updates continuously while simultaneously working on the issue.

Once the crisis has been resolved, sometimes it happens during a call, there will be talk about the reasons for the outage. This is where things for an outage go even more off the rails than the outage resolution itself.

To talk about the issue of blame with outages, we can start with the concept of blameless postmortems for the outage. This concept goes back decades at this point and is widely attributed to John Allspaw who specifically focused on crisis managment in the tech sector.

A blameless postmortem is a philosophy that the root cause analysis of an issue should focus on the issue itself and not focus on human causes and blame. The important outcome for a blameless postmortem is to put into place process improvements and additions that will prevent the issue from happening again.

Back in 2012 while working at Etsy, John Allspaw laid out his seven steps of how an outage and a blame based postmortem occurs:

1. An engineer makes a change that causes an outage
2. The "Engineer is punished, shamed, blamed, or retrained."
3. Trust is degraded between management and engineers, since traditionally the management would be looking for blame
4. Engineers will move away from transparency since transparency leads to blame
5. Both management and engineers lose vital context on root causes because of the lack of knowledge sharing
6. Outages become more likely since the knowledge sharing of cause has been reduced
7. An outage results in a change tracked to an engineer and the cycle loops back to step 1.

Now look at the expected outcomes of a blameless postmortem as Allspaw describes them, and contrast them with the blame based steps above:

In a blameless postmortem, the focus instead is on:

"
1. what actions they took at what time,
2. what effects they observed,
3. expectations they had,
4. assumptions they had made,
5. and their understanding of timeline of events as they occurred.
"

There is a big distinction that can be observed between the two models. And that is, the blameless postmortem is data driven. 

There is an additional benefit of the blameless postmortem, in that several of these items overlap with standard product and project management processes.

Expectations and assumptions overlap with the very important artifact of product management called and assumption map. Assumption maps are resuting diagrams that arise from meeting(s) of subject matter experts and interested parties that list their assumptions for a feature, product or new implementation; and map those against axes of known (vs unknown) against importance (vs non importance).

The timeline of events also has a resemblance of a project management roadmap. The one difference is that a project roadmap is completed ahead of events, while a timeline of an outage will be after events have occurred.

There is also a core talking point with outages and postmortems that Allspaw mentions in his 2012 article: complex systems fail. When your product reaches a tipping point of complexity in architecture, regardless of the number of engineers you have to deal with the environment, your system will start failing periodically. This can be mitigated somewhat with microservices, but there is still the issue that these systems still tie together (albeit with APIs), and that some functionality may be tied into multiple related microservice APIs that an engineer dealing with the outage may not understand except at a surface level. Complex systems will fail, and complex systems will fail in complex ways.

One last talking point that Allspaw points out in his 2012 article is a quote of Erik Hollnagel that I will paraphrase here:

outages don't happen because engineers roll the dice on dangerous changes; they happen because the assumption that the change will not result in the outcome that occurred because they are unrelated

Large companies including Google have adopted blameless postmortems to more effectively manage their issues that cause outages. The human benefit of adopting blameless postmortems is that people do not have to include the stress of worrying about blame coming in their direction when all is said and done.

But what if I told you that there are people who have not adopted this format, even after years of existence. And that there are people advocating against the blameless postmortem itself.

One of these positions in the "blame aware" concept of J. Paul Reed ( https://techbeacon.com/app-dev-testing/blameless-postmortems-dont-work-heres-what-does ). 

This states that blame is genetically hard wired (!) into humans, and because of this we need to include at the least an awareness of blame.

One important aspect of this is that it places a uncessarily high value on the outcome of a retrospective. If you hypothetically put an incredible amount of effort into post mortems, and you feel that they are so top of list for your company that you do want an aspect of blame assigned to them, they must have a high value? A pay back to customers is proof of the high value?

The reality is that while you are muddled in overly concerned, blame filled post mortems, your competitors are actually moving ahead with functionality. This is not a hypothetical point. I have witnessed this myself.

It's also incorrect to assume that humans are "hard wired" for blame, and especially untrue that we would be hard wired all at at the same level. When I was part of production down issues, and when I was part of the retrospectives on them, blame was very bottom of the list for me.

If you are aware of the concept of the "middle child" personality, you may connect the dots to the issue of blame. 

It was once believed, at least at a pop psychology level, that the middle child was the peace maker of the family. The elder children would be vying for control and attention, the younger children would be doted on as the "babies" in the family, and the middle children would be left to be the peacemakers in conflict between these two parties, and between parental conflict as well.

I am both a middle child and a prototypical middle child personality, even though I think the idea is debunked as a universal rule now.

What that means is that my perception of the value of blame is very different than that of J. Paul Reed.  The world and the people in it are much more complex than we can ascribe a universal identifier to.

This doesn't necessarily mean that the current state of blameless post mortems are the only way forward, and are at an end of development. This is an area ripe for value in continuing to investigate and improve.

2. "...no work in complex systems can be prescribed"

Think of a system that you may believe to be much simpler than a live software production stack. For the sake of argument, let's say the electrical system in your car.

If you have an internal combustion engine car, you may visualize the electric part of your car as the battery, your lights are looped into the circuit, it provides a spark to start your engine, and it will power other components like your radio or cigarette lighter outlet.

To jump to the point I am making: when will your electrical system fail, how and where and when?

I think all of us would recognize this as an unanswerable question. Unless we continously meter all of the electrical lines in our car, and know the previous history of the components (i.e. what are the specific components installed in the car, how old are they, what is their rated life, and has any other stress beside age affected them), we won't be able to answer this question.

This sometimes has failed even in the ultra critical realm of airplane maintenance. Components in airplanes cannot fail randomly because they will lead to disastrous results. But they have failed in the past, even some components failed after inspection. This will often lead to stricted regulations so that these components are checked more often and at a stricter level.

To make sure the electrical components in your car are assured on not failing randomly, you would have to have the equivalent level of monitoring for your car. This would be prohibitively expensive to operate your car, even if you could find the experts to do the work on a continuous basis. 

We have to assume that a component will fail at some point in the future, possibly at a less than optimal time.

Now picture a live production product with dozens of microservices across a distributed cloud environment. What will fail next?

Of course we don't know the answer to the question, because if we did, we would proactively fix the issue. There would no longer be live production bugs and site down issues. 

So why are we surprised when there is a site down issue?

The answer is that we have an incorrect cognitive bias ahead of time. 

Most likely the key issue is the oversimplification fallacy, also called the fallacy of single cause. 

If you have ever been part of a retrospective that used the "Five Whys" method, you may have been integrating this fallacy. The goal of the Five Whys is to get to the root cause of an issue, aka a single cause.

So why is the industry using a technique that is based on a logical fallacy?

The answer(s) may be complex as well.

Most likely leaders who accept these processes sometimes do so via individual recommendation or story driven reasons. Something along the lines of "Five why works well for us" or "You can get every answer via five whys". If we accept these statements without a rigorous analysis of the truth and options, it is absolutely possible to base your process on a fallacy.

I think it's also true that leaders like these methods because the alternative is a complex answer that may take a lot of work, time and effort to implement. The temptation of a simple, single point answer to a complex issue will always be alluring.

So what is the correct way to anticipate and prepare for, and post mortem issues?

The answer is actually already been hinted at, in that other disciplines besides software development are working on these same problems. In fact, fields like medicine, air travel and the military have been investigating crisis and failure for an extremely long time, and have some fairly advanced work done in the field.

Complex challenges require a complex solution. If a production failure isn't as simple as an upper vs lower case character change in code, but instead delves into deeper issues of why the business is driving the specific change that failed, and if there are any related architectural choices that contributed to it, there must be the courage to allow these issues to be followed to a logical conclusion.

For example, if a change in code leads to a break, ask the engineer for the ticket that led to the change. Follow the ticket to the people who approved the change , and what their motivations were. If those people point to a leader at a higher level, set up a call with that leader(s). And so on. If you are the business leader for the company, invest in and allow this analysis to happen. Don't filter alternative thoughts. Get involved with people that you don't normally talk to in the business, and get their perspective. If you chase these complex issues with a complex and multivariate solution, you may in fact create a new standard for how issues are tracked and measured that could then be shared industry wide.

3. Anomaly detection in software is, and always will be, an unsolved problem. 
