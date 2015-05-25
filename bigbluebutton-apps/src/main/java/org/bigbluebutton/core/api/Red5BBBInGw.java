package org.bigbluebutton.core.api;

import java.util.Map;

import org.bigbluebutton.conference.service.messaging.redis.MessageSender;
import org.bigbluebutton.red5.pubsub.messages.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Red5BBBInGw implements IBigBlueButtonInGW {

	private MessageSender sender;
	
	public void setMessageSender(MessageSender sender) {
		this.sender = sender;
	}
	
	@Override
	public void isAliveAudit(String aliveID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void statusMeetingAudit(String meetingID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endMeeting(String meetingID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endAllMeetings() {
		// TODO Auto-generated method stub

	}

	@Override
	public void createMeeting2(String meetingID, String externalMeetingID,
			String meetingName, boolean recorded, String voiceBridge,
			long duration, boolean autoStartRecording,
			boolean allowStartStopRecording, String moderatorPass,
			String viewerPass, long createTime, String createDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroyMeeting(String meetingID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllMeetings(String meetingID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockSettings(String meetingID, Boolean locked,
			Map<String, Boolean> lockSettigs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initLockSettings(String meetingID, Map<String, Boolean> settings) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendLockSettings(String meetingID, String userId,
			Map<String, Boolean> settings) {
		SendLockSettingsMessage msg = new SendLockSettingsMessage(meetingID, userId, settings);

		System.out.println("~~~sendLockSettings in Red5BBBInGw");
		sender.send(MessagingConstants.TO_MEETING_CHANNEL, msg.toJson());
	}

	@Override
	public void getLockSettings(String meetingId, String userId) {
		GetLockSettingsMessage msg = new GetLockSettingsMessage(meetingId, userId);

		System.out.println("~~~GetLockSettings in Red5BBBInGw");
		sender.send(MessagingConstants.TO_MEETING_CHANNEL, msg.toJson());
	}

	@Override
	public void lockUser(String meetingId, String requesterID, boolean lock,
			String internalUserID) {
		LockUserMessage msg = new LockUserMessage(meetingId, requesterID, lock, internalUserID);

		System.out.println("~~~LockUser in Red5BBBInGw");
		sender.send(MessagingConstants.TO_MEETING_CHANNEL, msg.toJson());
	}

	@Override
	public void validateAuthToken(String meetingId, String userId,
			String token, String correlationId, String sessionId) {
		ValidateAuthTokenMessage msg = new ValidateAuthTokenMessage(meetingId, userId, token, correlationId, sessionId);
		sender.send(MessagingConstants.TO_MEETING_CHANNEL, msg.toJson());
	}

	@Override
	public void registerUser(String roomName, String userid, String username,
			String role, String externUserID, String authToken) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userRaiseHand(String meetingId, String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lowerHand(String meetingId, String userId, String loweredBy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void shareWebcam(String meetingId, String userId, String stream) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unshareWebcam(String meetingId, String userId, String stream) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUserStatus(String meetingID, String userID, String status,
			Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getUsers(String meetingID, String requesterID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userLeft(String meetingId, String userId, String sessionId) {
		UserLeavingMessage msg = new UserLeavingMessage(meetingId, userId);
		sender.send(MessagingConstants.TO_USERS_CHANNEL, msg.toJson());
	}

	@Override
	public void userJoin(String meetingID, String userID, String authToken) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCurrentPresenter(String meetingID, String requesterID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignPresenter(String meetingID, String newPresenterID,
			String newPresenterName, String assignedBy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRecordingStatus(String meetingId, String userId,
			Boolean recording) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getRecordingStatus(String meetingId, String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userConnectedToGlobalAudio(String voiceConf, String userid,
			String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userDisconnectedFromGlobalAudio(String voiceConf,
			String userid, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAudioSettings(String meetingID, String requesterID,
			Boolean muted) {
		// TODO Auto-generated method stub

	}

	@Override
	public void muteAllExceptPresenter(String meetingID, String requesterID,
			Boolean mute) {
		// TODO Auto-generated method stub

	}

	@Override
	public void muteAllUsers(String meetingID, String requesterID, Boolean mute) {
		// TODO Auto-generated method stub

	}

	@Override
	public void isMeetingMuted(String meetingID, String requesterID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void muteUser(String meetingID, String requesterID, String userID,
			Boolean mute) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockMuteUser(String meetingID, String requesterID,
			String userID, Boolean lock) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectUserFromVoice(String meetingID, String userId,
			String ejectedBy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ejectUserFromMeeting(String meetingId, String userId,
			String ejectedBy) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceUserJoined(String meetingId, String userId,
			String webUserId, String conference, String callerIdNum,
			String callerIdName, Boolean muted, Boolean speaking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceUserLeft(String meetingId, String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceUserLocked(String meetingId, String userId, Boolean locked) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceUserMuted(String meetingId, String userId, Boolean muted) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceUserTalking(String meetingId, String userId,
			Boolean talking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void voiceRecording(String meetingId, String recordingFile,
			String timestamp, Boolean recording) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear(String meetingID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePresentation(String meetingID, String presentationID) {
		System.out.println("~~removePresentation in Red5BBBInGw");
		RemovePresentationMessage msg = new RemovePresentationMessage(meetingID, presentationID);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void getPresentationInfo(String meetingID, String requesterID,
			String replyTo) {
		GetPresentationInfoMessage msg = new GetPresentationInfoMessage(meetingID,
				requesterID, replyTo);
		System.out.println("~~getPresentationInfo in Red5BBBInGw");
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());

	}

	@Override
	public void sendCursorUpdate(String meetingID, double xPercent,
			double yPercent) {
		SendCursorUpdateMessage msg = new SendCursorUpdateMessage(meetingID,
				xPercent, yPercent);

		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void resizeAndMoveSlide(String meetingID, double xOffset,
			double yOffset, double widthRatio, double heightRatio) {

		System.out.println("~~resizeAndMoveSlide in Red5BBBInGw");
		ResizeAndMoveSlideMessage msg = new ResizeAndMoveSlideMessage(meetingID,
				xOffset, yOffset, widthRatio, heightRatio);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void gotoSlide(String meetingID, String page) {
		System.out.println("~~gotoSlide in Red5BBBInGw");
		GoToSlideMessage msg = new GoToSlideMessage(meetingID, page);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void sharePresentation(String meetingID, String presentationID,
			boolean share) {
		System.out.println("~~sharePresentation in Red5BBBInGw");
		SharePresentationMessage msg = new SharePresentationMessage(meetingID, presentationID, share);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void getSlideInfo(String meetingID, String requesterID,
			String replyTo) {
		System.out.println("~~getSlideInfo in Red5BBBInGw");
		GetSlideInfoMessage msg = new GetSlideInfoMessage(meetingID, requesterID,
				replyTo);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void sendConversionUpdate(String messageKey, String meetingId,
			String code, String presId, String presName) {
		System.out.println("~~sendConversionUpdate in Red5BBBInGw");
		SendConversionUpdateMessage msg = new SendConversionUpdateMessage(messageKey, meetingId,
				code, presId, presName);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void sendPageCountError(String messageKey, String meetingId,
			String code, String presId, int numberOfPages, int maxNumberPages,
			String presName) {
		System.out.println("~~sendPageCountError in Red5BBBInGw");

		SendPageCountErrorMessage msg = new SendPageCountErrorMessage(messageKey, meetingId,
				code, presId, numberOfPages, maxNumberPages, presName);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void sendSlideGenerated(String messageKey, String meetingId,
			String code, String presId, int numberOfPages, int pagesCompleted,
			String presName) {
		System.out.println("~~sendSlideGenerated in Red5BBBInGw");
		SendSlideGeneratedMessage msg = new SendSlideGeneratedMessage(messageKey, meetingId,
				code, presId, numberOfPages, pagesCompleted, presName);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void sendConversionCompleted(String messageKey, String meetingId,
			String code, String presId, int numPages, String presName,
			String presBaseUrl) {
		System.out.println("~~sendConversionCompleted in Red5BBBInGw");
		SendConversionCompletedMessage msg = new SendConversionCompletedMessage(messageKey, meetingId,
				code, presId, numPages, presName, presBaseUrl);
		sender.send(MessagingConstants.TO_PRESENTATION_CHANNEL, msg.toJson());
	}

	@Override
	public void getPolls(String meetingID, String requesterID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createPoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void startPoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopPoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void respondPoll(String meetingID, String requesterID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void preCreatedPoll(String meetingID, String msg) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCurrentLayout(String meetingID, String requesterID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void broadcastLayout(String meetingID, String requesterID,
			String layout) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getChatHistory(String meetingID, String requesterID,
			String replyTo) {
		System.out.println("~~getChatHistory in Red5BBBInGw");
		GetChatHistoryRequestMessage msg = new GetChatHistoryRequestMessage(meetingID, requesterID, replyTo);
		sender.send(MessagingConstants.TO_CHAT_CHANNEL, msg.toJson());
	}

	@Override
	public void sendPublicMessage(String meetingID, String requesterID,
			Map<String, String> message) {
		System.out.println("~~sendPublicMessage in Red5BBBInGw");
		SendPublicChatMessage msg = new SendPublicChatMessage(meetingID, requesterID, message);
		sender.send(MessagingConstants.TO_CHAT_CHANNEL, msg.toJson());
	}

	@Override
	public void sendPrivateMessage(String meetingID, String requesterID,
			Map<String, String> message) {
		System.out.println("~~sendPrivateMessage in Red5BBBInGw");
		SendPrivateChatMessage msg = new SendPrivateChatMessage(meetingID, requesterID, message);
		sender.send(MessagingConstants.TO_CHAT_CHANNEL, msg.toJson());
	}

	@Override
	public void sendWhiteboardAnnotation(String meetingID, String requesterID,
			Map<String, Object> annotation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestWhiteboardAnnotationHistory(String meetingID,
			String requesterID, String whiteboardId, String replyTo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearWhiteboard(String meetingID, String requesterID,
			String whiteboardId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void undoWhiteboard(String meetingID, String requesterID,
			String whiteboardId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enableWhiteboard(String meetingID, String requesterID,
			Boolean enable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void isWhiteboardEnabled(String meetingID, String requesterID,
			String replyTo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockLayout(String meetingID, String setById, boolean lock,
			boolean viewersOnly, String layout) {
		// TODO Auto-generated method stub
		
	}

}
