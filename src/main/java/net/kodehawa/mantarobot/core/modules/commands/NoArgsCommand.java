package net.kodehawa.mantarobot.core.modules.commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.kodehawa.mantarobot.core.modules.commands.base.AbstractCommand;
import net.kodehawa.mantarobot.core.modules.commands.base.Category;
import net.kodehawa.mantarobot.core.modules.commands.base.CommandPermission;

public abstract class NoArgsCommand extends AbstractCommand {
	public NoArgsCommand(Category category) {
		super(category);
	}

	public NoArgsCommand(Category category, CommandPermission permission) {
		super(category, permission);
	}

	protected abstract void call(GuildMessageReceivedEvent event, String content);

	@Override
	public void run(GuildMessageReceivedEvent event, String commandName, String content) {
		call(event, content);
	}
}