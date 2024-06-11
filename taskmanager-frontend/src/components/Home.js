// src/pages/Home.js
import React from 'react';
import TaskList from '../components/TaskList';
import AddTask from '../components/AddTask';

const Home = () => {
    return (
        <div>
            <h1>Task Manager</h1>
            <AddTask />
            <TaskList />
        </div>
    );
};

export default Home;