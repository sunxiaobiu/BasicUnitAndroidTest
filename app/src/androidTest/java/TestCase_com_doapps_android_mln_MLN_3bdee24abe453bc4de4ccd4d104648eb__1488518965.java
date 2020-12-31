import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_doapps_android_mln_MLN_3bdee24abe453bc4de4ccd4d104648eb__1488518965 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(MediaMetadataCompat.class);
      MediaDescriptionCompat var2 = ((MediaMetadataCompat)var1).getDescription();
      CharSequence var3 = var2.getSubtitle();
   }
}
