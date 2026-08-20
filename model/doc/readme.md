
```drawio-resource
../role.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of engagement: who is engaged with a thing, in what capacity, and for how long.
Six types, and no role vocabulary of its own - the roles are yours. 

[TOC levels=6]

## Position in the tower

The aspect spine of the [Nasdanika model tower](https://nasdanika.com/models.html) runs

> [nxcore](https://nxcore.models.nasdanika.org/) < **role** < [iam](https://iam.models.nasdanika.org/) < [seal](https://seal.models.nasdanika.org/) < [lifecycle](https://lifecycle.models.nasdanika.org/) < [accounting](https://accounting.models.nasdanika.org/) < [decision analysis](https://analysis.decision.models.nasdanika.org/) < [decision binding](https://binding.decision.models.nasdanika.org) < [governance](https://governance.models.nasdanika.org/) < [work](https://work.models.nasdanika.org/) < [requirements](https://requirements.models.nasdanika.org/) < [architecture](https://architecture.models.nasdanika.org/) < [threat](https://threat.models.nasdanika.org/)

and the enterprise branch continues off the top of it into [capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/).

This is the second floor.
Almost every other page in the tower describes what its model *inherits*; this one has almost nothing to inherit and is instead inherited by nearly everything.
`Role` and `Actor` extend nxcore's `NamedPeriod`, `ActorDomain` extends `NamedElement`, `AbstractActor` extends `StringIdentity` - and that is the whole dependency.
In exchange, because IAM's `Subject` and `AccessControlled` sit directly on top and the spine is unbroken from there upward, a threat model `Asset`, an architecture `Element`, a governance `Control`, a work item, a capability provider, and an organizational unit all arrive already carrying `roles`.

The position is a consequence of the rule the tower follows - a model sits at the lowest position consistent with its own dependencies - and of an observation about what "who owns this?" actually is.
Ownership is not an attribute of a capability, or of a document, or of a service.
It is the same relationship in every case, and it needs identity, documentation, provenance, and a validity interval, all of which nxcore already provides.
Everything above needs it and nothing it needs lives above, so it lands here, one floor up from the foundation.

Being this low imposes a discipline: whatever this floor costs, every floor above pays.
That is why there are six types and no role vocabulary.
A model that shipped an enumeration of Responsible / Accountable / Consulted / Informed would impose four English words on every element in the tower forever.

### Undergoer and Actor

The extension point is called `Undergoer` rather than `Owned` or `RoleTarget`, and the pairing with `Actor` is deliberate.
In [Role and Reference Grammar](https://en.wikipedia.org/wiki/Role_and_reference_grammar), *actor* and *undergoer* are the two macroroles of a clause: the participant that acts, and the participant that is acted upon.
A capability, a document section, an assessment, or a dataset is grammatically the undergoer - the thing operated on - and the people, teams, systems, and agents engaged with it are the actors.
The model says exactly that and nothing more.

## Competitive landscape

Five camps model this. Four of them model something adjacent and are routinely mistaken for it; the fifth is a spreadsheet.

**RACI and its variants.** RACI, RASCI, CAIRO, Bain's RAPID, Atlassian's DACI. The dominant vocabulary for exactly this problem, and the model treats it with respect - what it does not do is hardcode it.
The letters are fixed by the framework, so an organization that needs *Sponsor*, *Steward*, *Dissenter*, *Custodian*, or *Data Owner* either overloads a letter or abandons the framework.
Worse, the artifact is a grid: rows of activities, columns of people, letters in cells, in a spreadsheet or a slide that references its subjects by name.
Nothing in the grid is attached to the thing it governs, nothing is dated, and the whole matrix is re-authored rather than amended.

**RBAC and identity governance.** NIST RBAC, LDAP and AD groups, Okta and Entra ID, SailPoint, Saviynt, Keycloak.
These own the word "role" in most engineers' heads, and they answer a different question: *what may this principal do in this system*.
A role there is a bundle of permissions.
A role here is an engagement with a specific model element - being the approver of this control, the author of this section, the custodian of this dataset - which may or may not imply any system permission at all.
The two are related, and the relation is typed: the [IAM model](https://iam.models.nasdanika.org/) one floor up defines `EngagedSubject`, a subject defined by holding a named role in *this* model.
Engagement data lives here; grants derived from it live there.
That seam is the reason this floor exists separately rather than being folded into IAM.

**Ownership fields in every tool.** `CODEOWNERS`, Backstage's `spec.owner`, ServiceNow assignment groups, Jira assignee and reporter, Confluence page owners, steward columns in Collibra, Alation, and Atlan.
Each is right about its own artifacts and mute about everything else.
The shape is always the same: one field, one owner, one tool, no second role, no history, and no crosswalk - so "who owns this?" has a different answer per system and the answers cannot be joined.
These are excellent sources to *load* and poor places to keep the record.

**EA and process notations.** ArchiMate's `BusinessRole`, `BusinessActor`, and the assignment relationship; BPMN lanes and pools; UML actors; RACI matrices in ARIS.
Structurally the closest prior art, and the vocabulary is genuinely open.
The limits are that assignment is static structure with no validity interval, the model lives in a proprietary repository, and the roles apply to the notation's own element types rather than to whatever a consumer happens to be modeling.

**HR position management.** Workday, SAP SuccessFactors, Oracle HCM.
Authoritative for employment and reporting lines, and effective-dated, which is more than most of the above manage.
But a position is not an engagement with an artifact.
Being a senior engineer in Platform Services says nothing about which of the four hundred services that team owns you are the custodian of.

**The real competitor, as always: the ownership column and the RACI slide.** Both are cheaper than any model for producing one answer once.
The wedge is everything after the first answer - a second role on the same element, an ownership handoff that leaves a record rather than overwriting one, the question "what did this person hold before they left", and a stewardship assertion that is still legible after the tool that held it was decommissioned.

The position this model takes is the diagonal none of the five occupy: **an open role vocabulary, attached to the element rather than to a matrix, dated on both sides, and applicable to every element in the tower at once.**

## What a typed model adds

**Roles are instance data, not an enumeration.** This is the move the tower makes repeatedly - the [lifecycle model](https://lifecycle.models.nasdanika.org/) with stages, the [work model](https://work.models.nasdanika.org/) with `WorkType`, the [IAM model](https://iam.models.nasdanika.org/) with `Action`: what was an enum becomes data.
A `Role` is a named, documented model element authored by whoever needs it, so Owner, Reviewer, Approver, Sponsor, Steward, Auditor, Custodian, and Dissenter cost a data change rather than a metamodel release.
RACI, RAPID, and DACI are expressible as conventions within the mechanism rather than baked into it, and two organizations with incompatible vocabularies can be assembled into one model without either surrendering theirs.

**Engagement is dated twice, independently.** `Role` extends `NamedPeriod` and `RoleAssignment` extends `Period`, which are two different facts.
The role of *Data Steward* existed on this dataset from the day the governance program started until the day it was retired; within that span three different people held it, each for their own interval, each with a `comment` recording why.
An ownership handoff is a new assignment, not an overwrite.
"Who was accountable for this in March?" and "what was unowned during the reorganization?" become queries rather than archaeology.

Because nxcore's `Temporal` supports relative and bounded time, those intervals need not be calendar dates.
An engagement that starts at the next release and runs for ninety days is expressible before the release date is known and resolves when it lands - so a template model carries its role assignments along with everything else in it.

**The assignment travels with the element it governs.** `Undergoer` is a mixin, so `roles` are contained in the element, in the same artifact, versioned in the same commits.
A rename or a move carries the stewardship with it, and a change of owner is reviewed in the same pull request as the change of substance.
This is the structural difference from every side-table approach: a matrix references its subjects by name and rots the moment they are renamed; containment cannot.

**An actor is whatever holds the engagement.** `AbstractActor` has one member of its own - a `String` `id` - and two realizations. `Actor` is a `NamedPeriod`: a person, a team, a vendor, a system, or an AI agent, with its own documentation, provenance, and lifespan.
`ActorDomain` is a named container of actors, which is both a catalog and a group.
Because `RoleAssignment` holds an `AbstractActor`, assigning a role to a whole team is the same construct as assigning it to one person, with no second reference type and no special case.

**Federation without a registry.** There is deliberately no `RoleReference` or `ActorReference` on this floor. An actor may be defined inline where it is used, or in a shared `ActorDomain` published as a Maven artifact, and the two converge through nxcore's `uris` merge anchors: several teams may independently name `myorg://actors/jane-doe`, and at assembly time those definitions are one logical element. Author locally without asking anyone's permission; federate when federation is worth it. A central actor registry demands the opposite order, which is why they stay empty.

**Documentation is an undergoer too.** This floor specializes nxcore's `Content` and `Section` - the types that carry an element's documentation - as `Undergoer`s. A page is rarely owned as a whole: one section was written by the architect, another by the security team, a third has been unreviewed for two years.
Because a documented element's `docSections` form a tree of `Section`s, authorship and review responsibility attach at whatever granularity the content actually has.
A generated site can then say, per section, who wrote it, who last reviewed it, and whether that review has lapsed.
The [IAM model](https://iam.models.nasdanika.org/) extends these same two classes again to make content access-controlled, so an audience-scoped section and an authored section are one object rather than two parallel annotations.

## Applications

### Generalized RACI over the whole estate

The base case, and the one that motivated the floor.
Any element in any model above becomes an `Undergoer` and acquires an open set of dated engagements.
Because the vocabulary is instance data, the same mechanism carries a four-letter RACI convention in one part of the organization and a twelve-role stewardship taxonomy in another, and a portfolio query spans both.
The matrix, if anyone still wants one, is a rendering.

### Data stewardship annotated on the data itself

Most organizations track data ownership in a dictionary spreadsheet or a Confluence table.
The tracker names the data; the data knows nothing about the tracker.
Schemas evolve, the tracker lags, and by the time an incident asks who stewards a field, the answer is a row referencing a column renamed two releases ago.

Role assignments attach to the data definition instead.
For data modeled in Ecore they ride on the model elements themselves - an actor is the Steward of an `EPackage`, of an `EClass` within it, or of a single attribute - and the documentation generator renders them alongside the element documentation.
The assignment versions with the schema, survives renames because it is contained rather than referenced by name, and is reviewed in the pull request that changes the thing it governs.
The same holds for schemas lifted from relational databases, message definitions, and APIs, which is exactly the kind of work generative tooling has made cheap - the [SQL model](https://sql.models.nasdanika.org/) is the worked example.

### Ownership of a legacy estate

A legacy estate is thousands of artifacts whose owners are half-remembered.
Candidates come from the sources that already exist - `CODEOWNERS`, commit history, deployment records, ticket assignment - and the org hierarchy supplies the structure, but the outcome has to be recorded somewhere that admits *time-boxed* ownership, because ownership of a legacy estate is always provisional and frequently transitional.
Time-boxed `Role`s with dated `RoleAssignment`s to actors and actor domains are that record.

The most valuable page of the resulting report is usually the one nobody asked for: the unowned artifacts. It is a query, not an audit.

### Access control derived from engagement

The [IAM model](https://iam.models.nasdanika.org/) defines `EngagedSubject` - a subject constituted by holding a named role on the protected element, optionally inherited from ancestors so that the owner of a catalog is treated as engaged with its entries.
This is relationship-based access control with the relationship kept where it belongs: "the reviewer of this document may see the draft" is a grant that needs no group to be provisioned, no membership to be maintained, and no drift between the group and the fact it was meant to represent.
Ownership data lives on this floor; the grants derived from it live one floor up.

### Approvals, attestations, and segregation of duties

Compose with [seal](https://seal.models.nasdanika.org/), [lifecycle](https://lifecycle.models.nasdanika.org/), and [governance](https://governance.models.nasdanika.org/).
An approval gate is a lifecycle transition guard demanding a signed `Sojourn`; who was entitled to sign it is a role engagement valid on the date of signing; segregation of duties is the constraint that the actor engaged as author is not the actor engaged as approver.
Each of those is a query over data the tower already holds, and each is answerable retrospectively, because the engagement record from the date in question is still there - assignments accumulate rather than being rewritten.
Governance's `Assessment` is itself an `Undergoer`, so who assessed, who reviewed, and who accepted a finding are the same kind of record.

### Accountability for AI agents

An `Actor` is not required to be human, and the distinction matters more each quarter.
An agent that authors content, opens work, or moves an element through a lifecycle is an actor with a dated engagement, so "which agent produced this, under whose accountability, during what window" is a structural fact rather than a log-scraping exercise.
The [AI governance model](https://ai.governance.models.nasdanika.org/) leans on precisely this: an agent's engagements are the accountability record its controls are written against, and the human role engaged alongside it is what keeps accountability from evaporating into the tooling.

### Key-person concentration and the offboarding query

Assemble the federation and ask what a single actor holds across it.
The answer is a risk report: which elements have exactly one engaged owner, which owners hold engagements far outside their unit, and what becomes unowned on a given date.
Composed with [governance](https://governance.models.nasdanika.org/), key-person concentration stops being a phrase in a risk register and becomes a computed one, and offboarding stops depending on the departing person remembering what they held.

## Authoring and loading

Engagement data is born in artifacts that already exist, and those are the source rather than the export target:

* **YAML and the Groovy DSL** for hand-authored roles and actor domains, with git markers giving every assignment a permalink back to the exact line and commit that asserted it.
* **`CODEOWNERS`, commit history, and forge metadata** as ownership candidates for code and configuration.
* **Excel** for RACI matrices and stewardship inventories - one row per element-role-actor claim, which is the shape a `RoleAssignment` already has.
* **Directory and HR exports** - LDAP, Entra ID, an HCM extract - as `ActorDomain`s, so actor identity is imported rather than retyped.
* **Draw.io** for assignment and org diagrams drawn in a workshop, via the [drawio model](https://drawio.models.nasdanika.org/).

The spreadsheet is where the matrix is drawn; the model is where it accumulates.

## Model overview

| Area | Types |
|---|---|
| Extension point | `Undergoer` (anything operated on; contains `roles`) |
| Engagement | `Role` (named, documented, dated; contains `assignments`), `RoleAssignment` (dated, `comment`, holds an actor) |
| Actors | `AbstractActor`, `Actor` (named, dated), `ActorDomain` (named container - catalog and group) |
| Documentation specializations | `Content`, `Section` (nxcore documentation types made `Undergoer`s) |
| Reused, not redefined | nxcore `NamedPeriod`, `NamedElement`, `Period`, `Temporal`, `StringIdentity`, `Referrable`, `Marker`, and `uris` merge anchors |

## What sits on top

The [IAM model](https://iam.models.nasdanika.org/) sits directly above and is the first consumer: `EngagedSubject` turns an engagement into a grant, and IAM's `Content` and `Section` extend this floor's so that documentation is both authored and audience-scoped. IAM's own `Role` is an RBAC permission bundle and a distinct concept - the two are neighbors rather than duplicates, and the seam between them is the point.

Above that, engagement arrives by inheritance rather than by declaration.
[Governance](https://governance.models.nasdanika.org/) makes `Assessment` an `Undergoer` directly, and describes itself as an aspect model in the same terms this one is: the lifecycle model applies to anything with a lifecycle, the role model to anything operated on.
[Work](https://work.models.nasdanika.org/) ships an `Undergoer` upgrade class so that assignee, reviewer, and approver are engagements rather than attributes.
The [MCP model](https://mcp.models.nasdanika.org/) makes `Catalog` an `Undergoer` so a tool catalog has an owner and a security owner.
[Capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/) get owner, steward, and approver on every provider, persona, and unit without declaring anything - and product management's root `ProductModel` is itself an `ActorDomain`, so a consuming model carries its own cast.

## Resources

* [Sources on GitHub](https://github.com/Nasdanika-Models/role)
* [Nasdanika model tower](https://nasdanika.com/models.html)
* [NxCore model](https://nxcore.models.nasdanika.org/) - the floor directly below, and the source of identity, documentation, provenance, and time
* [IAM model](https://iam.models.nasdanika.org/) - the floor directly above, and where engagement becomes access
* [Product management model](https://product-management.models.nasdanika.org/) - roles as generalized RACI in a consuming model
* [Architecture model](https://architecture.models.nasdanika.org/) - the tower ordering and the rules that govern it
