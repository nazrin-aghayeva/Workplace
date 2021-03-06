package ibaHW11.Controller;

import ibaHW11.Entity.Family;
import ibaHW11.Entity.Human;
import ibaHW11.Entity.Pet;
import ibaHW11.Service.FamilyService;

import java.util.List;

public class FamilyController extends FamilyService {
    private FamilyService familyService;


    public FamilyController() {
        this.familyService = familyService;
    }




    @Override
    public void getAllFamilies() {
        super.getAllFamilies();
    }

    @Override
    public void displayAllFamilies() {
        super.displayAllFamilies();
    }

    @Override
    public void getFamiliesBiggerThan(int specified) {
        super.getFamiliesBiggerThan(specified);
    }

    @Override
    public void getFamiliesLessThan(int specified) {
        super.getFamiliesLessThan(specified);
    }

    @Override
    public long countFamiliesWithMemberNumber(long given) {
        return super.countFamiliesWithMemberNumber(given);
    }

    @Override
    public void createNewFamily(Human mother, Human father) {
        super.createNewFamily(mother, father);
    }

    @Override
    public void deleteFamilyByIndex(int i) {
        super.deleteFamilyByIndex(i);
    }

    @Override
    public Family bornChild(Family family, String gender) {
        return super.bornChild(family, gender);
    }

    @Override
    public Family adoptChild(Family family, Human human) {
        return super.adoptChild(family, human);
    }

    @Override
    public void deleteAllChildrenOlderThen(int required) {
        super.deleteAllChildrenOlderThen(required);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public List<Pet> getPets(int id) {
        return super.getPets(id);
    }

    @Override
    public void addPet(int id, Pet pet) {
        super.addPet(id, pet);
    }
}
