package SpringOnWeb.BuildingSpringWebApplication.Spittr.Data;

import SpringOnWeb.BuildingSpringWebApplication.Spittr.Spittle;

import java.util.List;

/**
 * Created by congzihan on 17/1/3.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
