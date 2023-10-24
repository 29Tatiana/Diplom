package ru.geekbrains.lesson1.store3d.modelelements;

import java.util.Collection;

public class Scene {
    //region Initializers and Constructors

    {
        id = ++counter;
    }

    public Scene(Collection<PolygonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(Collection<PolygonalModel> models, Collection<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    //endregion

    //region Public Properties

    public int getId() {
        return id;
    }

    public Collection<PolygonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(Collection<Camera> cameras) {
        this.cameras = cameras;
    }

    //endregion


    //region Private Fields

    private static int counter = 0;
    private final int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    //endregion

}
