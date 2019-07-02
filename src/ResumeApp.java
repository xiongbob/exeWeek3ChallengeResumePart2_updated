import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {

    public static void main(String[] args) {
        ArrayList<Resume> resumeList = new ArrayList<Resume>();
        //ArrayList<Education> myEdu = new ArrayList<Education>();
        //ArrayList<Experience> myExperience = new ArrayList<Experience>();
        //ArrayList<String> jobDescriptions = new ArrayList<>();
        //ArrayList<Skills> skillsArrayList = new ArrayList<Skills>();

        int count = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to add a RESUME?(y/n)");
        String resume = input.nextLine();

        while (resume.equalsIgnoreCase("y")) {
            Resume resumeN = new Resume();

            System.out.println("Enter your name: ");
            resumeN.setName(input.nextLine());
            System.out.println("Enter your email");
            resumeN.setEmail(input.nextLine());
            System.out.println("Enter your phone: ");
            resumeN.setPhone(input.nextLine());

            System.out.println("Do you want to add an education section?(y/n)");
            String check = input.nextLine();

            while (check.equalsIgnoreCase("y")) {
                Education education = new Education();
                System.out.println("Education");
                System.out.println("Enter your University: ");
                education.setUniversity(input.nextLine());
                System.out.println("Enter your Grad Year: ");
                education.setGradYear(input.nextLine());
                System.out.println("Enter your degree: ");
                education.setDegree(input.nextLine());
                System.out.println("Enter your major: ");
                education.setMajor(input.nextLine());

                resumeN.addEducation(education);

                System.out.println("Do you want to add another education section?(y/n)");
                String checkAgain = input.nextLine();
                if (checkAgain.equalsIgnoreCase("y")) {
                    continue;
                } else
                    break;
            }


            System.out.println("Do you want to add an experience section?(y/n)");
            String check2 = input.nextLine();

            while (check2.equalsIgnoreCase("y")) {
                Experience experience = new Experience();
                System.out.println("Experience");
                System.out.println("Enter your previous company: ");
                experience.setCompany(input.nextLine());
                System.out.println("Enter your job title: ");
                experience.setJobTitle(input.nextLine());
                System.out.println("Enter your Start Date: ");
                experience.setStartDate(input.nextLine());
                System.out.println("Enter your End Date: ");
                experience.setEndDate(input.nextLine());
                System.out.println("Enter job description: ");
                experience.setJobDescriptions(input.nextLine());

                resumeN.addExperience(experience);

                System.out.println("Do you want to add another experience section?(y/n)");
                String checkAgain = input.nextLine();

                if (checkAgain.equalsIgnoreCase("y")) {
                    continue;
                } else
                    break;
            }

            System.out.println("Do you want to add a skills section?(y/n)");
            String check3 = input.nextLine();

            while (check3.equalsIgnoreCase("y")) {
                Skills skill = new Skills();
                System.out.println("Skills");
                System.out.println("Enter a skill name ");
                skill.setSkillName(input.nextLine());
                System.out.println("Enter your Skill Proficiency: ");
                skill.setSkillProficiency(input.nextLine());

                resumeN.addSkills(skill);

                System.out.println("Do you want to add another skills section?(y/n)");
                String checkAgain = input.nextLine();
                if (checkAgain.equalsIgnoreCase("y")) {
                    continue;
                } else
                    break;
            }

            resumeList.add(resumeN);

            System.out.println("Do you want to change the name?(y/n)");
            String checkName = input.nextLine();
            if (checkName.equalsIgnoreCase("y")) {
                //Resume resumeName = new Resume();
                System.out.println("Enter your new name: ");
                resumeN.setName(input.nextLine());
                //break;
            }
            //else

            System.out.println("Do you want to change the email address?(y/n)");
            String checkEmail = input.nextLine();
            if (checkEmail.equalsIgnoreCase("y")) {
                //Resume resumeEmail = new Resume();
                System.out.println("Enter your new email: ");
                resumeN.setEmail(input.nextLine());
                //break;
            }
            //else
            System.out.println("Do you want to change the phone number?(y/n)");
            String checkPhone = input.nextLine();
            if (checkPhone.equalsIgnoreCase("y")) {
                //Resume resumePhone = new Resume();
                System.out.println("Enter your new phone number: ");
                resumeN.setPhone(input.nextLine());
                //break;
            }

            System.out.println("Do you want to add another RESUME?(y/n)");
            String checkAgain = input.nextLine();
            if (checkAgain.equalsIgnoreCase("y")) {
                continue;
            } else
                break;
        }
/*
        System.out.println("Do you want to search the skill?(y/n)");
        String checkSkill = input.nextLine();
        if (checkSkill.equalsIgnoreCase("y")) {
            System.out.println("Please input the keyword: ");
            String keyword = input.nextLine();
            for (Resume res : resumeList) {
                if (res.isSkillMatch(keyword)) {
                    System.out.println("The person's name " + res.getName()+ "has the skill " + keyword);
                }
            }
        }
*/
            for (Resume res : resumeList) {
                res.showResume();
            }

          ///put here not in Recruiter
        System.out.println("Do you want to search the skill?(y/n)");
        String checkSkill = input.nextLine();
        if (checkSkill.equalsIgnoreCase("y")) {
            System.out.println("Please input the keyword: ");
            String keyword = input.nextLine();
            for (Resume res : resumeList) {
                if (res.isSkillMatch(keyword)) {
                    //System.out.println(res.getName());
                    System.out.println("The person's name " + res.getName()+ " has the skill " + keyword);
                }
            }
        }

        }

    }
