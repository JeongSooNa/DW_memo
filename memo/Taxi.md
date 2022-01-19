# Taxi 회사별 합/갯수


* cording in SQL(DBeaver)

        CREATE TABLE taxi (
                EMPNO VARCHAR(5),
                ENAME DECIMAL(10) 
                );

        insert into taxi values('d',29363);
        insert into taxi values('g',29584);
        insert into taxi values('d',40360);
        insert into taxi values('d',20098);
        insert into taxi values('d',17737);
        insert into taxi values('d',40474);
        insert into taxi values('d',23423);
        insert into taxi values('d',38285);

        insert into taxi values('q',4500);
        insert into taxi values('g',38947);
        insert into taxi values('d',27759);
        insert into taxi values('d',34199);
        insert into taxi values('d',44042);
        insert into taxi values('d',36317);
        insert into taxi values('d',20539);
        insert into taxi values('d',40752);
        insert into taxi values('d',24093);
        insert into taxi values('d',38056);
        insert into taxi values('d',19853);
        insert into taxi values('g',28325);
        insert into taxi values('d',36928);
        insert into taxi values('d',39927);
        insert into taxi values('d',21512);
        insert into taxi values('d',37860);
        insert into taxi values('d',31021);
        insert into taxi values('d',19281);
        insert into taxi values('d',33440);
        insert into taxi values('d',23399);

        insert into taxi values('d',38377);
        insert into taxi values('d',28728);
        insert into taxi values('d',37560);
        insert into taxi values('d',31522);
        insert into taxi values('g',40298);
        insert into taxi values('d',34130);
        insert into taxi values('d',27958);
        insert into taxi values('d',30076);
        insert into taxi values('g',35918);
        insert into taxi values('q',31966);
        insert into taxi values('q',130000);
        insert into taxi values('d',30232);
        insert into taxi values('d',26587);
        insert into taxi values('d',25120);
        insert into taxi values('g',42617);
        insert into taxi values('d',30311);
        insert into taxi values('d',31639);
        insert into taxi values('d',33262);
        insert into taxi values('d',10867);
        insert into taxi values('q',1630);

        insert into taxi values('g',42541);
        insert into taxi values('d',42936);
        insert into taxi values('d',29656);
        insert into taxi values('d',39076);
        insert into taxi values('d',34270);
        insert into taxi values('d',33782);
        insert into taxi values('g',46860);
        insert into taxi values('d',36916);
        insert into taxi values('c',34977);
        insert into taxi values('d',37449);
        insert into taxi values('g',40629);
        insert into taxi values('d',39030);
        insert into taxi values('d',25989);
        insert into taxi values('d',30327);
        insert into taxi values('d',34977);
        insert into taxi values('d',45068);
        insert into taxi values('g',48725);
        insert into taxi values('d',30924);
        insert into taxi values('d',25741);
        insert into taxi values('d',25493);

        insert into taxi values('q',3000);
        insert into taxi values('d',35988);
        insert into taxi values('d',35225);
        insert into taxi values('d',37771);
        insert into taxi values('d',33773);
        insert into taxi values('d',25475);
        insert into taxi values('d',39692);
        insert into taxi values('d',38212);
        insert into taxi values('d',25897);
        insert into taxi values('d',20099);
        insert into taxi values('d',35630);
        insert into taxi values('d',36006);
        insert into taxi values('g',37091);
        insert into taxi values('d',35290);
        insert into taxi values('d',37045);
        insert into taxi values('d',21165);
        insert into taxi values('d',36815);
        insert into taxi values('g',34224);
        insert into taxi values('d',32615);
        insert into taxi values('d',26881);

        insert into taxi values('d',29523);
        insert into taxi values('d',45597);
        insert into taxi values('d',36089);
        insert into taxi values('d',31816);
        insert into taxi values('d',29730);
        insert into taxi values('d',34196);
        insert into taxi values('d',33286);
        insert into taxi values('d',30042);
        insert into taxi values('d',30318);
        insert into taxi values('g',34839);
        insert into taxi values('d',36962);
        insert into taxi values('g',48330);
        insert into taxi values('d',38322);
        insert into taxi values('s',24318);
        insert into taxi values('q',19900);
        insert into taxi values('g',37394);
        insert into taxi values('d',38304);
        insert into taxi values('d',29546);
        insert into taxi values('q',4000);
        insert into taxi values('q',2350);

        insert into taxi values('q',2500);
        insert into taxi values('q',100000);
        insert into taxi values('d',32973);
        insert into taxi values('d',28851);
        insert into taxi values('d',24040);
        insert into taxi values('g',44280);
        insert into taxi values('d',33779);
        insert into taxi values('d',31297);
        insert into taxi values('d',37847);
        insert into taxi values('d',32552);
        insert into taxi values('g',26504);
        insert into taxi values('d',41637);
        insert into taxi values('d',38340);
        insert into taxi values('d',31548);
        insert into taxi values('d',23878);
        insert into taxi values('d',45239);
        insert into taxi values('d',36548);
        insert into taxi values('d',38931);
        insert into taxi values('d',18117);
        insert into taxi values('d',41431);

        insert into taxi values('d',40687);

        insert into taxi values('g',36548);
        insert into taxi values('g',46589);
        insert into taxi values('d',42347);
        insert into taxi values('d',25428);
        insert into taxi values('d',38595);
        insert into taxi values('d',44463);
        insert into taxi values('d',46015);
        insert into taxi values('d',45655);
        insert into taxi values('d',41358);
        insert into taxi values('d',28173);
        insert into taxi values('d',35537);
        insert into taxi values('d',23516);
        insert into taxi values('d',42957);
        insert into taxi values('d',34696);
        insert into taxi values('d',40499);
        insert into taxi values('d',35602);
        insert into taxi values('d',38411);
        insert into taxi values('d',32091);
        insert into taxi values('d',33735);
        insert into taxi values('d',30473);

        insert into taxi values('q',2500);
        insert into taxi values('a',33499);
        insert into taxi values('de',23046);
        insert into taxi values('d',50045);
        insert into taxi values('d',25159);
        insert into taxi values('q',2000);
        insert into taxi values('d',43190);
        insert into taxi values('d',12885);
        insert into taxi values('d',44113);
        insert into taxi values('g',25285);
        insert into taxi values('d',31470);
        insert into taxi values('d',43831);
        insert into taxi values('d',22760);
        insert into taxi values('d',37170);
        insert into taxi values('d',29703);
        insert into taxi values('d',52696);
        insert into taxi values('d',47861);
        insert into taxi values('d',30402);
        insert into taxi values('d',55891);
        insert into taxi values('d',16031);

        SELECT 
            count(*)
        from taxi
        ;

        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'd'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'g'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'q'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'c'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 's'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'a'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        where taxi.EMPNO = 'de'
        ;
        select
            count(EMPNO),
            sum(ENAME)
        from taxi
        ;
        /* d : 동대전
        * g : 가장
        * q : 기타
        * c : 대전개인택시충전소
        * s : 시온
        * a : 알피엔에너지
        * de : 대덕충전소 */  