import React from "react";
import styles from "../styles/CohortDetails.module.css";

const cohorts = [
  {
    id: 1,
    name: "Java Full Stack",
    trainer: "Anita",
    status: "ongoing",
    batch: "Cohort 24",
  },
  {
    id: 2,
    name: "React Essentials",
    trainer: "Rahul",
    status: "completed",
    batch: "Cohort 18",
  },
  {
    id: 3,
    name: "Cloud Fundamentals",
    trainer: "Meera",
    status: "ongoing",
    batch: "Cohort 27",
  },
  {
    id: 4,
    name: "Data Analytics",
    trainer: "Sandeep",
    status: "completed",
    batch: "Cohort 15",
  },
];

export default function CohortDetails() {
  return (
    <section className={styles.grid}>
      {cohorts.map((cohort) => (
        <article key={cohort.id} className={styles.box}>
          <h2>{cohort.name}</h2>
          <p>Trainer: {cohort.trainer}</p>
          <p>Batch: {cohort.batch}</p>
          <p>
            Status:{" "}
            <span
              className={
                cohort.status === "ongoing" ? styles.ongoing : styles.completed
              }
            >
              {cohort.status}
            </span>
          </p>
        </article>
      ))}
    </section>
  );
}
