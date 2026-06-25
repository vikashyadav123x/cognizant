package DecoratorPatternExample;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        Notifier slackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));

        System.out.println("Email only:");
        emailNotifier.send();

        System.out.println("\nEmail + SMS:");
        smsNotifier.send();

        System.out.println("\nEmail + SMS + Slack:");
        slackNotifier.send();
    }
}
