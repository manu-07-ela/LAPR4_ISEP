package eapli.base.AGV.Domain;

import eapli.base.ordermanagement.domain.ProductOrder;
import eapli.base.warehouse.domain.AGVDock;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class AGV implements AggregateRoot<AGVId> {

    @EmbeddedId
    private AGVId agvId;

    @OneToOne
    private AGVDock agvDock;

    @Embedded
    private Range range;

    @Embedded
    private MaxWeightCapacity maxWeightCapacity;

    @Embedded
    private MaxVolumeCapacity maxVolumeCapacity;

    @Embedded
    private Model model;

    @Embedded
    private BriefDescription briefDescription;

    @Embedded
    private AGVPosition position;

    @Embedded
    private AGVStatus agvStatus;

    @OneToMany
    private AGVTask agvTask;

    private ChangeAGVStatus status;



    public AGV(){}

    public AGV(final AGVId agvId, final BriefDescription briefDescription, final Model model, final MaxWeightCapacity maxWeightCapacity, final MaxVolumeCapacity maxVolumeCapacity, final Range range, final AGVPosition position, final AGVDock agvDock, final ChangeAGVStatus status){
        this.agvId = agvId;
        this.range = range;
        this.maxWeightCapacity = maxWeightCapacity;
        this.maxVolumeCapacity = maxVolumeCapacity;
        this.model = model;
        this.briefDescription = briefDescription;
        this.position = position;
        this.agvDock = agvDock;
        this.status = status;
        this.agvStatus = AGVStatus.FREE;
    }

    public AGV(final AGVId agvId, final BriefDescription briefDescription, final Model model, final MaxWeightCapacity maxWeightCapacity, final MaxVolumeCapacity maxVolumeCapacity, final Range range, final AGVPosition position, final AGVDock agvDock, final ChangeAGVStatus status, AGVTask task){
        this.agvId = agvId;
        this.range = range;
        this.maxWeightCapacity = maxWeightCapacity;
        this.maxVolumeCapacity = maxVolumeCapacity;
        this.model = model;
        this.briefDescription = briefDescription;
        this.position = position;
        this.agvDock = agvDock;
        this.status = status;
        this.agvStatus = AGVStatus.FREE;
        this.agvTask = task;
    }

    @Override
    public boolean sameAs(Object other) {
        if(other == null) return false;
        if(this == other) return true;

        eapli.base.AGV.Domain.AGV newObj = ((eapli.base.AGV.Domain.AGV) other);

        return agvId == newObj.agvId && range == newObj.range && maxWeightCapacity == newObj.maxWeightCapacity && maxVolumeCapacity == newObj.maxVolumeCapacity
                && model == newObj.model && briefDescription == newObj.briefDescription && position == newObj.position && agvDock == newObj.agvDock && agvTask == newObj.agvTask;
    }

    public AGVDock agvDock() {
        return agvDock;
    }

    @Override
    public AGVId identity() {
        return agvId;
    }

    public AGVId getAgvId() {
        return agvId;
    }

    public AGVDock getAgvDock() {
        return agvDock;
    }

    public Range getRange() {
        return range;
    }

    public MaxWeightCapacity getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public MaxVolumeCapacity getMaxVolumeCapacity() {
        return maxVolumeCapacity;
    }

    public Model getModel() {
        return model;
    }

    public BriefDescription getBriefDescription() {
        return briefDescription;
    }

    public AGVPosition getPosition() {
        return position;
    }

    public ChangeAGVStatus getStatus() {
        return status;
    }

    public AGVTask getAgvTask() {
        return agvTask;
    }

    public AGVStatus getAgvStatus() {
        return agvStatus;
    }




    public void createATask(String description, ProductOrder order){

        this.agvTask = new AGVTask(description, order);

    }

    public void addMoreOrders(ProductOrder order){
        this.agvTask.addMoreOrders(order);
    }

    public void assignATakForAGV(AGVTask task){
        this.agvTask = agvTask;
    }


    public void changeAGVStatus(ChangeAGVStatus status){
        this.status=status;
    }

    public void changeAGVId(AGVId id){this.agvId=id;}

}