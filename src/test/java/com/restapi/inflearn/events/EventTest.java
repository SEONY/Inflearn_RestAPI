package com.restapi.inflearn.events;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    /*
     * builder가 동작하는지 확인하기 위한 테스트
     */
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Infleaarn Spring REST API")
                .description("REST API development with Spring")
                .build();

        assertThat(event).isNotNull();
    }

    /*
     * Java Bean 스펙 준수하는지 확인하기 위한 테스트
     *    - default 생성자, getter, setter로 만들 수 있는지 확인
     */
    @Test
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Spring";

        Event event = new Event();

        // When
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);

    }

}