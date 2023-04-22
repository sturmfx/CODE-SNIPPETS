public void tick()
    {
        spawnBot();
        checkPlayerBotCollision();
        limitPlayerOnMap();
        if(up && !Geometry.intersectsCircleWithEdges(rec1.get(0).p1,rec1.get(0).p2, rec1.get(0).p3, rec1.get(0).p4, new Point(player.getX(), player.getY() - MOVE_PER_TICK), player.getWidth()/2))
        {
            player.setY(player.getY() - MOVE_PER_TICK);
        }
        if(down && !Geometry.intersectsCircleWithEdges(rec1.get(0).p1,rec1.get(0).p2, rec1.get(0).p3, rec1.get(0).p4, new Point(player.getX(), player.getY() + MOVE_PER_TICK), player.getWidth()/2))
        {
            player.setY(player.getY() + MOVE_PER_TICK);
        }
        if(right && !Geometry.intersectsCircleWithEdges(rec1.get(0).p1,rec1.get(0).p2, rec1.get(0).p3, rec1.get(0).p4, new Point(player.getX() + MOVE_PER_TICK, player.getY()), player.getWidth()/2))
        {
            player.setX(player.getX() + MOVE_PER_TICK);
        }
        if(left && !Geometry.intersectsCircleWithEdges(rec1.get(0).p1,rec1.get(0).p2, rec1.get(0).p3, rec1.get(0).p4, new Point(player.getX() - MOVE_PER_TICK, player.getY()), player.getWidth()/2))
        {
            player.setX(player.getX() - MOVE_PER_TICK);
        }
    }


public void spawnBot()
    {
        if(bots.size() < 3)
        {
            boolean controller = true;
            int x = 0;
            int y = 0;
            Bot b1 = null;
            while(controller)
            {
                x = rand.nextInt(WIDTH);
                y = rand.nextInt(HEIGHT);
                for(Rectangle1 r1: rec1)
                {
                    if(!(r1.p2.getX() > x && r1.p1.getX() < x && r1.p3.getY() < y && r1.p2.getY() > y))
                    {
                        controller = false;
                        break;
                    }
                }
            }
            b1 = new Bot(x, y, 10);
            bots.add(b1);
        }
    }
