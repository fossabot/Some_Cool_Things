package org.nixub86.SCT.CommandReportAndLike;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

public class Command implements ICommand{

	int Report, Like, Repytachiya;
	
	protected final List ListCommand;
	
	protected String nameCommandReport, nameCommnadLike, nameCommnadInfo;
	
	
	
	public Command()
	{
		ListCommand = new ArrayList(); 
		//Report = 0;
		//Like = 0;
		
		Repytachiya = Like - Report;
		
		nameCommandReport = "rep";
		nameCommnadLike = "like";
		nameCommnadInfo = "information";
	}
	
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getCommandAliases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
		ListCommand.add("rep");
		ListCommand.add("like");
		ListCommand.add("Info");
		return ListCommand;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		// TODO Auto-generated method stub
		return false;
	}

}
