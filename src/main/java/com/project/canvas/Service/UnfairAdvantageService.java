package com.project.canvas.Service;

import com.project.canvas.Entity.UnfairAdvantage;

import java.util.List;

public interface UnfairAdvantageService {

    public List<UnfairAdvantage> unfairAdvantageListAll();

    public UnfairAdvantage unfairAdvantageSave(UnfairAdvantage unfairAdvantage);

    public UnfairAdvantage unfairAdvantageGetById(Long id);

    public UnfairAdvantage unfairAdvantageUpdate(UnfairAdvantage unfairAdvantage);

    public void unfairAdvantageRemove(Long id);


}
