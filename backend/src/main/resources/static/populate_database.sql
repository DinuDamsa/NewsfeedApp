/*
    WARNING! THE FOLLOWING SCRIPT WHEN RUN WILL ERASE ALL YOUR DATA FROM THE LOCAL DATABASE
    ALSO, ALL THE IDs MUST BE NEGATIVE NUMBERS! IT WILL BE LATER USEFUL FOR CREATING INTEGRATION TESTS
*/

TRUNCATE TABLE  posts CASCADE;
TRUNCATE TABLE  categories CASCADE;
TRUNCATE TABLE  post_details CASCADE;
TRUNCATE TABLE  users CASCADE;

INSERT INTO users(id, about_you, nickname, profile_image_path, username) VALUES
(-1, 'Lorem ipsum protests virtual happy hour my camera is off dumpster fire essential Drizly Joe Exotic. Ventilator disinfect sourdough bread.', 'john', null, 'johncena'),
(-2, 'About me', 'user', null, 'user'),
(-3, 'Lorem ipsum it''s about March 213th the new normal you''re on mute. super-spreader event.', 'mary', null, 'maryanaP'),
(-4, 'Lorem ipsum at least 6 feet self care four seasons total landscaping. What day is it? dumpster fire sourdough bread. Mr. Peanut K-shaped recovery storm Area 51 vote flatten the curve. Doomscrolling frontline workers COVID-19 spread.', 'Alex', null, 'AlexVonMugurel'),
(-5, '', 'MrNobody', null, 'MrNobody13'),
(-6, 'Only 1 post user xD', 'TheOne', null, 'uvuvwevwevwe onyetenyevwe ugwemubwem ossas'),
(-7, 'DONT USE ME', 'USELESS_USER', null, 'IAmAnUselessUser');

INSERT INTO post_details(id, content_picture_path, text_content, title) VALUES
(-1, null,'Capicola tongue sirloin rump salami.','Midsagittal'),
(-2, null,'Drumstick pig pastrami, beef ham meatball andouille venison porchetta pancetta hamburger flank capicola swine biltong.','Pediatrician scleritises rosery iotas faux colorfulness'),
(-3, null,'Cupim rump landjaeger, prosciutto ham hock ham cow buffalo capicola.','Compulsorily supremeness colonus tuyers cometh judoists'),
(-4, null,'Pork belly drumstick venison, leberkas shank rump brisket porchetta prosciutto flank ball tip t-bone cupim picanha.','Exonym puppy transcendence shapes excimers'),
(-5, null,'Salami porchetta bacon picanha flank cow jerky boudin meatball ham hock.','Texts jelly camerae funniest cuttlebone'),
(-6, null,'Brisket fatback capicola biltong andouille drumstick bresaola, ribeye tongue ham cow burgdoggen beef corned beef.','Colander preordination befoul thenar washiest chroma'),
(-7, null,'Strip steak pork chop ham spare ribs venison frankfurter short ribs turducken cupim meatloaf sausage leberkas beef chislic andouille.','Plainsmen'),
(-8, null,'Pork loin corned beef sirloin, ham hock spare ribs ribeye flank ground round strip steak.','Graveyard onomastically'),
(-9, null,'Meatball sirloin prosciutto swine doner pork chop jerky landjaeger ham hock ground round boudin cow pork loin meatloaf.','Cochairwomen'),
(-10, null,'Buffalo biltong short loin, pork chop burgdoggen salami pork loin swine drumstick bresaola hamburger jowl brisket t-bone pancetta.','Metump steelmaker nightlifes ruralises scummers'),
(-11, null,'Pancetta shank tail, pork belly pig t-bone ground round rump tenderloin venison jowl short loin strip steak.','Misclaim kiang'),
(-12, null,'Ground round short loin boudin, pig jerky andouille meatloaf burgdoggen t-bone.','Pornography communalizes countermanding compounders fleeter'),
(-13, null,'Rump corned beef pork bacon shankle brisket.','Mizunas dysmenorrheic'),
(-14, null,'Sirloin meatloaf andouille ball tip, swine strip steak pork belly capicola shoulder picanha prosciutto pastrami.','Pelotas cluck'),
(-15, null,'Burgdoggen shoulder strip steak, bresaola porchetta kielbasa pork loin rump buffalo shankle biltong sausage jowl venison.','Unedifying aponeuroses philosophic stockinged tamps subsume'),
(-16, null,'Pastrami ham hock ribeye turducken frankfurter fatback jowl rump tongue.','Humates subclustering trailerite'),
(-17, null,'Turkey pastrami salami prosciutto bacon fatback shank capicola jowl meatball cow sausage pork pork belly.','Relatedness incongruences'),
(-18, null,'Kielbasa chuck spare ribs porchetta, bresaola ribeye sirloin ground round jerky ham pig buffalo meatball.','Impurest aprons authentication ichthyologies scotch burner'),
(-19, null,'Short ribs pork cow, strip steak pastrami sirloin beef buffalo ham pig beef ribs tenderloin tail pork loin fatback.','Lithe reupholstered feteritas cladophylls strangers'),
(-20, null,'Pig bresaola boudin cow drumstick chislic kielbasa venison bacon strip steak shankle buffalo.','Delvers handpress monodical'),
(-21, null,'Turducken ham hock t-bone, pig beef ribs picanha sausage frankfurter cupim jowl.','Reconduct camphorated acquitters constrictive easterlies'),
(-22, null,'Biltong picanha landjaeger buffalo turducken chuck capicola pork loin pastrami beef ribs short loin tenderloin filet mignon pork chop.','Sectionalism matriarchs chambered kindness picomole'),
(-23, null,'Swine kevin pork belly short loin strip steak buffalo picanha tail pig brisket jowl chislic.','Vulgars dikdiks couteaux'),
(-24, null,'Swine kielbasa pork shankle leberkas ham hock picanha pastrami ground round.','Cancans'),
(-25, null,'Doner short ribs biltong beef shank turducken pork chop bacon.','Mongolian tweeters mousetraps steenbuck'),
(-26, null,'Hamburger kielbasa ball tip, burgdoggen turkey jowl meatball shoulder pork chop cupim corned beef drumstick sirloin flank buffalo.','Goonier colossuses excites unlace'),
(-27, null,'Tenderloin shank shankle pastrami t-bone.','Rondeau swims vulnerably'),
(-28, null,'Hamburger pig t-bone ground round, pork flank pork chop beef ribeye frankfurter filet mignon boudin tenderloin.','Waterlogged dustrag cerebrations burns mesomeres silurids'),
(-29, null,'Chicken tail tri-tip biltong pork chop bresaola beef ribs salami, picanha spare ribs chuck jerky.','Archbishop dreamlessnesses handwheel graciously desertion'),
(-30, null,'Chuck ham fatback bacon landjaeger andouille swine boudin.','Lexicographic interbehavioral'),
(-31, null,'Some random description. ', 'Random title');

INSERT INTO categories(id, category_name) VALUES
(-1, 'Animals'),
(-2, 'Funny'),
(-3, 'GIF'),
(-4, 'Meme'),
(-5, 'Car'),
(-6, 'Sports'),
(-7, 'Music'),
(-8, 'Category with 1 post'),
(-9, 'Unused');

INSERT INTO posts(id, category_id, post_details_id, user_id) VALUES
(-1, -3, -1, -4),
(-2, -5, -2, -2),
(-3, -3, -3, -5),
(-4, -4, -4, -4),
(-5, -1, -5, -1),
(-6, -4, -6, -3),
(-7, -6, -7, -1),
(-8, -3, -8, -3),
(-9, -2, -9, -1),
(-10, -6, -10, -2),
(-11, -3, -11, -2),
(-12, -5, -12, -3),
(-13, -5, -13, -2),
(-14, -5, -14, -3),
(-15, -5, -15, -2),
(-16, -7, -16, -5),
(-17, -1, -17, -5),
(-18, -7, -18, -3),
(-19, -4, -19, -1),
(-20, -5, -20, -4),
(-21, -3, -21, -5),
(-22, -6, -22, -4),
(-23, -6, -23, -2),
(-24, -3, -24, -5),
(-25, -4, -25, -2),
(-26, -5, -26, -1),
(-27, -5, -27, -2),
(-28, -5, -28, -4),
(-29, -6, -29, -1),
(-30, -5, -30, -3),
(-31, -8, -31, -5);