
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import CalculateSettlementHistoryManager from "./components/listers/CalculateSettlementHistoryCards"
import CalculateSettlementHistoryDetail from "./components/listers/CalculateSettlementHistoryDetail"

import RemittanceRemittanceManagementManager from "./components/listers/RemittanceRemittanceManagementCards"
import RemittanceRemittanceManagementDetail from "./components/listers/RemittanceRemittanceManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/calculates/settlementHistories',
                name: 'CalculateSettlementHistoryManager',
                component: CalculateSettlementHistoryManager
            },
            {
                path: '/calculates/settlementHistories/:id',
                name: 'CalculateSettlementHistoryDetail',
                component: CalculateSettlementHistoryDetail
            },

            {
                path: '/remittances/remittanceManagements',
                name: 'RemittanceRemittanceManagementManager',
                component: RemittanceRemittanceManagementManager
            },
            {
                path: '/remittances/remittanceManagements/:id',
                name: 'RemittanceRemittanceManagementDetail',
                component: RemittanceRemittanceManagementDetail
            },



    ]
})
