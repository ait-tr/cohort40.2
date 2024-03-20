package l44.imporvisation.mvc.controllers;

import l44.imporvisation.mvc.models.Flat;
import l44.imporvisation.mvc.models.FlatRepository;
import l44.imporvisation.mvc.models.IRepository;

public class FlatController implements IFlatController {
    private IRepository<Flat> flatRepo;

    public FlatController() {
        flatRepo = new FlatRepository();
    }

    @Override
    public void add(Flat flat) {
        flatRepo.put("1212", flat);
    }
}
