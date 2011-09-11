package jenkins.plugins.htmlaudio.domain;

import java.util.Collection;


/**
 * Repository for {@link BuildEvent}s.
 * 
 * @author Lars Hvile
 */
public interface BuildEventRepository {
    
    /**
     * Adds a new {@link BuildEvent}.
     */
    void add(BuildEvent event);
    
    /**
     * Removes an existing {@link BuildEvent}.
     */
    void remove(BuildEvent event);
    
    /**
     * Returns each existing {@link BuildEvent}.
     */
    Collection<BuildEvent> list();
    
    /**
     * Returns each {@link BuildEvent} that is newer than, i.e. happened after, a provided event.
     */
    Collection<BuildEvent> findNewerThan(long buildEventId);
    
}
