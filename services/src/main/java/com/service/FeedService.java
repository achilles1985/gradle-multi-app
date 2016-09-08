package com.service;

import com.repo.Feed;
import com.repo.FeedRepo;

import java.util.List;

public class FeedService {

    private FeedRepo feedRepo;

    public List<Feed> getAllFeeds() {
        return feedRepo.getFeeds();
    }
}
