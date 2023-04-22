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
