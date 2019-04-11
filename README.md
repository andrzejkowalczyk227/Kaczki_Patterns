# Kaczki_Patterns
design patterns playground

project has been created as the playground for trying learnt design pattern,
loosely based on example from "head first desing patterns" book, project
contains following patterns: observer, abstact factory, adapter, singleton, composite 

primary goal was to make usage of classes as unified as possible for client, while still offering additional functionalities in clear and flexible manner

flexibility is granted by decorating the base classes, like adapting other types or making the duck observable, which differs from book example, as i felt that implementing the observer interface in base classes makes them possess
behaviour which is clearly not a part of 'duck type' class model and in this case should be viewed as 'additional functionality', a decorator fullfil best -
ex. of usage with adapter: new KaczkowatePodOkiem(new KurczakAdapter(new Kurczak()));

as the process of decorating can be unclear on client side, it is delegated with the usage of abstact factory pattern,
client can choose concrete factory producing base or decorated duck types, with those being returned

grouping is archieved with recursive collection, delegating calls to leaves and nested groups
