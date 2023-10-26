package main.model;

import main.dao.IEmployee;
import main.dao.ISession;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IEmployee {
    private String username;
    private String password;
    private String position;
    private List<ISession> managedSessions;

    private static final int maxManageSessions = 20;

    public Employee(String username, String password, String position) {
        this.username = username;
        this.password = password;
        this.position = position;
        this.managedSessions = new ArrayList<>();
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public List<ISession> getManagedSessions() {
        return managedSessions;
    }

    @Override
    public void addManagedSession(ISession session) throws CustomException {
        managedSessions.add(session);
        if (managedSessions.size() >= maxManageSessions) {
            throw new CustomException("You've gone beyond your limits session capacity!");
        }
    }

    @Override
    public void removeManagedSession(ISession session) {
        managedSessions.remove(session);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
