## John Allspaw and crisis management

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

