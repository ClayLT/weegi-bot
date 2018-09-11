package com.discordbots.WeegiBOT;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
        @SuppressWarnings("deprecation")
		JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
        jda.addEventListener(new App());
    }
    
    @Override
    public void onMessageReceived(MessageReceivedEvent evt)
    {
    	//Objects
    	User botUser = evt.getAuthor();
    	MessageChannel botMsgCh= evt.getChannel();
    	Message botMsg = evt.getMessage();
    	
    	//Commands
    	if(botMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"help"))
    	{
    		botMsgCh.sendMessage(botUser.getAsMention() + " Here is a list of my commands:\n```\nl.help\nl.youtube\nl.twitch\nl.twitter\nl.specss\n```").queue();
    	}    	
    	
    	if(botMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"youtube"))
    	{
    		botMsgCh.sendMessage(botUser.getAsMention() + " Looweegi's YouTube channel is: https://youtube.com/channel/UC2WRaYeELsOXkeRKRKGV2iw .  Subscribe if you haven't!").queue();
    	}
    	if(botMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"twitch"))
    	{
    		botMsgCh.sendMessage(botUser.getAsMention() + " Looweegi's Twitch channel is: https://twitch.tv/looweegi_ .  Follow if you haven't!").queue();
    	}
    	if(botMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"twitter"))
    	{
    		botMsgCh.sendMessage(botUser.getAsMention() + " Looweegi's Twitter is: https://twitter.com/looweegi . Follow if you haven't!").queue();
    	}
    	if(botMsg.getContentRaw().equalsIgnoreCase(Ref.prefix+"specs"))
    	{
    		botMsgCh.sendMessage(botUser.getAsMention() + " Here are Looweegi's specs and equipment: https://docs.google.com/document/d/17OA1ubUG3WNWycGOxyq0Edrq842t0hn7uLweujjZ1Y4/edit?usp=sharing").queue();
    	}
    	
    }
}
